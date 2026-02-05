package org.itemmgmt.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Long id;

    @NotBlank(message = "Item name must not be empty")
    private String name;

    @NotBlank(message = "Item description must not be empty")
    private String description;
}
