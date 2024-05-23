package com.example.PDA_SHOPPINGMALL.Products;

import com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils;
import com.example.PDA_SHOPPINGMALL.Products.utils.Validator;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils.error;
import static com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils.success;

@RestController
@AllArgsConstructor
@Slf4j
// 필드로 생성자 구현
public class ProductController {

    ProductService productService;
    //Logger logger = LoggerFactory.getLogger(ProductController.class);

    //상품 조회
    @GetMapping("/products/{id}")
    public ApiUtils.ApiResult findProduct(@Valid @PathVariable(value="id") int id) {

        if (!Validator.isNumber(id)) {
            // TODO log INFO 레벨 id type
//            Logger logger = LoggerFactory.getLogger(ProductController.class);
//            logger.info(id+"");
              log.info(id+"");
            return error("상품 id를 숫자로 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        Product resultProduct = productService.findProduct(id);
        if(resultProduct == null){
            return error("해당하는 상품이 없습니다", HttpStatus.NOT_FOUND);
        }

        return success(resultProduct.getName());

    }

    @GetMapping("/products")
    public ApiUtils.ApiResult findAllProduct(
            @RequestParam("limit") int limit,
            @RequestParam("currentPage") int currentPage,
            @RequestParam(required = false, value = "categoryId") Integer categoryId){
        log.info("limit = {}", limit);
        log.info("currentPage={}", currentPage);
        log.info("categoryId ={}", categoryId);


        //TODO null 체크는 어디서??
        //전체검색 & 카테고리별 검색
        if(categoryId == null){
            List<Product> products = productService.readAllProduct(limit, currentPage);
            return success(products);

        }else{
            List<Product> products = productService.readAllProduct(limit, currentPage, categoryId);
            return success(products);

        }

    }


    // 상품 등록
    @PostMapping("/products")
    public ApiUtils.ApiResult registerProduct(@Valid  @RequestBody ProductDTO productDTO, Errors errors ) {

        if(errors.hasErrors()){

            String message = errors.getFieldError().getDefaultMessage();
            return error(message, HttpStatus.BAD_REQUEST);

        }else{

            Product savedProduct = productService.createProduct(productDTO);
            return success(savedProduct.getName());

        }


    }

    //상품 삭제
    @DeleteMapping("/products/{id}")
    public ResponseEntity delteteProduct(@PathVariable(value="id") int id) {

        if (!Validator.isNumber(id)) {
            // TODO log INFO 레벨 id type
//            Logger logger = LoggerFactory.getLogger(ProductController.class);
//            logger.info(id+"");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            //System.out.println("id는 OK");
        }

        productService.deleteProduct(id);
        Product product = productService.findProduct(id);

        if(product == null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }

    @PostMapping("/products/delete")
    public ResponseEntity deleteProducts(@RequestBody Map<String, List<Integer>> deleteRequest){

        List<Integer> producstIds = deleteRequest.get("productIds");

        if(producstIds.size()==0){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        productService.deleteProducts(producstIds);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
