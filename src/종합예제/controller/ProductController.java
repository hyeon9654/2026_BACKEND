package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dao.ProductDao;
import 종합예제.model.dto.ProductDto;

public class ProductController {
    private ProductController() {}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance() { return instance; }

    private IBaseDao ib = ProductDao.getInstance();

    public boolean save(ProductDto productDto) {
        // TODO 1: productDto 전달받아 DAO의 save()를 호출하고 결과 반환
    boolean result = ib.save(productDto);
    return result;
    }

    public ArrayList<ProductDto> findAll() {
        // TODO 2: DAO의 findAll() 호출하여 결과를 받고 반환
    ArrayList<Object> result = ib.findAll();
    ArrayList<ProductDto> productList = new ArrayList<>();
    
    for(Object obj : result){
        productList.add((ProductDto)obj);
    }
    return productList;
    }   
    }

/*
1. DAO에서 전체 목록을 가져온다.
그런데 타입은 ArrayList<Object>로 온다.

2. View에게 돌려줄 ProductDto 전용 리스트를 새로 만든다.

3. result 안의 Object들을 하나씩 꺼낸다.

4. 꺼낸 Object를 ProductDto로 형변환한다.

5. productList에 넣는다.

6. ProductDto 리스트를 View에게 반환한다.
 */