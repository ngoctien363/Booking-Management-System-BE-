package com.tip.dg4.dc4.bookingmanagementsystem.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class is used to create the object that contains the info to refresh the token for the User
 *
 * @author Tuan Le / DG4 Team<br>
 * Created on 12/6/2023
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RefreshTokenDto {
	private String token;
}
