//package com.cloudthat.venueservice.model;
//
//public class ApiResponse {
//}
package com.cloudthat.venueservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private Boolean success;
    private String message;
    private Object data;
}