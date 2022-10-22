package com.example.kiashop.controllers.basic;

import com.example.kiashop.bases.BaseController;
import com.example.kiashop.bases.BaseResponseDto;
import com.example.kiashop.config.TokenConfig;
import com.example.kiashop.config.UserDetailServiceConfig;
import com.example.kiashop.dto.consumes.LoginConsumeDto;
import com.example.kiashop.dto.consumes.UserConsumeDto;
import com.example.kiashop.dto.produces.TokenProduceDto;
import com.example.kiashop.entities.UserEntity;
import com.example.kiashop.exceptions.BadRequestException;
import com.example.kiashop.repository.UserRepository;
import com.example.kiashop.services.DeviceService;
import com.example.kiashop.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequiredArgsConstructor
@RequestMapping("${base.api}/basic/auth")
public class BasicAuthController extends BaseController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceConfig mUserDetailServiceConfig;
    private final TokenConfig mTokenConfig;
    private final DeviceService mDeviceService;
    private final UserService mUserService;
    private final UserRepository mUserRepository;

    @PostMapping("/login")
    public ResponseEntity<BaseResponseDto> login(@RequestBody LoginConsumeDto params) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        UserDetails userDetails = mUserDetailServiceConfig.loadUserByUsername(params.getUsername());
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    userDetails.getUsername(),
                    params.getPassword()));
        } catch (Exception e) {
            throw new BadRequestException("Incorrect password");
        }
        UserEntity userEntity = mUserRepository.findByUsername(userDetails.getUsername());
        TokenProduceDto tokenProduceDto = mTokenConfig.generateToken(userDetails, userEntity.getId());
        mDeviceService.updateToken(tokenProduceDto, userEntity);
        return success(tokenProduceDto, "Login successful");
    }

    @PatchMapping("/refresh-token")
    public ResponseEntity<BaseResponseDto> refreshToken(HttpServletRequest request) {
        return success(mDeviceService.refreshToken(request), "Refresh token successful");
    }

    @PostMapping("/register")
    public ResponseEntity<BaseResponseDto> createRegister(@RequestBody UserConsumeDto userConsumeDto) {
        return created(mUserService.createRegister(userConsumeDto), "Create user successful");
    }

    @PostMapping("/reset-password")
    public ResponseEntity<BaseResponseDto> resetPassword(@RequestBody LoginConsumeDto loginConsumeDto) throws MessagingException {
        mUserService.resetPassword(loginConsumeDto.getUsername());
        return success("Reset password successful");
    }
}
