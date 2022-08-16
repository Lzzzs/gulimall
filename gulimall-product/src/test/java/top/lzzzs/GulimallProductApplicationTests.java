package top.lzzzs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lzzzs.product.GulimallProductApplication;
import top.lzzzs.product.entity.BrandEntity;
import top.lzzzs.product.service.BrandService;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("lzs");
        brandService.save(brandEntity);

        System.out.println("success");
    }

}
