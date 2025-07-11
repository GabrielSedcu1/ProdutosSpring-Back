package com.live.codiguin.Spring.domain_product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        String id,

        @NotBlank
        String name,

        @NotNull
        Integer priceInCents
) {
}
