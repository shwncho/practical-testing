package sample.cafekiosk.spring.api.service.product.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sample.cafekiosk.spring.domain.product.Product;
import sample.cafekiosk.spring.domain.product.ProductSellingType;
import sample.cafekiosk.spring.domain.product.ProductType;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCreateServiceRequest {

    private ProductType type;

    private ProductSellingType sellingType;

    private String name;

    private int price;

    public Product toEntity(String nextProductNumber) {
        return Product.builder()
                .productNumber(nextProductNumber)
                .type(type)
                .sellingType(sellingType)
                .name(name)
                .price(price)
                .build();
    }

}
