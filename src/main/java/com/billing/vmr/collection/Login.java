package com.billing.vmr.collection;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "login")
public class Login {
    private String userName;
    private String password;
}
