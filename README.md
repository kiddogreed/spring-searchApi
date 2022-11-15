# spring-searchApi

Search api created using spring boot


1. Create Entity(model) package(folder)<br>
2. Define product entity/  fields with variables (long id, String nameDesc, LocalDateTime dateCreated)<br>

3. use Lombok  annotation-> @getter  , @setter , @noArgsContructor and @allArgsConstructor for automate gettersetters and constructors<br> 

4. use db annotation @Entity ,@Table(name="products") , @Id  -> for primary key and 
@GeneratedValue(strategy = GenerationType.IDENDITY)<br> 

5. Use hibernate annotation @CreationTimeStamp and @UpdateTimeStamp

6. Create productRepository interface and extends the JpaRepository ENTITY and its primary key (<Product, Long>)

7. In repository create query method that return List of products
  * <br> List<Product> searchProducts(String query);
  *<br> add annotation @Query("Select  p FROM Product") 

8. Create Services interface and create method List<Product> searchProducts(String query);   

9. Create Service impl/implementation class and implements services<name of serive>(ProductService)

10. override/ right Click, add unimplemented method and use @Service annotation

11. inject product repository 
  * create private ProductRepository productRepository;
  * right click to generate constructor and call product method

12.   @Override
  public List<Product> searchProducts(String query) {
  
  
     List<Product> products =  productRepository.searchProducts(query);
    
     return products;
    }
    
13. Create Controller and add annotation 
    * @RestController
    * @RequestMapping("api/v1/products")

14. use contructor base dependency
    * private ProductService productService;
    * generate constructor

15. add @GETMAPPING("url") and response Entity

public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
    return ResponseEntity.ok(productService.searchProducts(query));
  }

16. add @requestParam("query")

17. Add create product Endpoint
    * public Product createProduct(@RequestBody Product product){
    return productService.createProduct(product);
  }
    * go to implementation and override and generate method for create Product

18. return productRepository.save(product);

