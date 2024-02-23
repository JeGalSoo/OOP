package view;

import builder.ProductBuilder;
import model.ProductDto;
import service.ProductService;
import serviceImpl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        List<ProductDto> pd = new ArrayList<>();
        ProductService pdo = ProductServiceImpl.getInstance();
        for(int i=0; i<6;i++){
            pd.add(new ProductBuilder()
                    .pno(pdo.createRandompno())
                    .name(pdo.createRandomName())
                    .company(pdo.createRandomCompany())
                    .price(pdo.createRandomPrice())
                    .build());
        }
        pd.forEach(i->{
            System.out.println(i.toString());
        });
    }
}
