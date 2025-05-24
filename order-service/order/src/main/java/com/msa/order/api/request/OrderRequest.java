package com.msa.order.api.request;

import java.math.BigDecimal;

public record OrderRequest(
        String productName,
        int quantity,
        String customerName,
        BigDecimal price
) {
}
