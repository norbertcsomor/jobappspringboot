package com.example.jobapp.requests;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Az álláshirdetés létrehozásának kérését leíró validációs változó.
 * 
 * @author Norbert Csomor
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreJobadvertisementRequest {
    @NotBlank(message = "A munkakör mező kitöltése kötelező!")
    private String title;
    @NotBlank(message = "A helyszín mező kitöltése kötelező!")
    private String location;
    @NotBlank(message = "A leírás mező kitöltése kötelező!")
    private String description;
}
