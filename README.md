# spring-searchApi

Search api created using spring boot


1. Create Entity(model) package(folder)<br>
2. Define product entity/  fields with variables (long id, String nameDesc, LocalDateTime dateCreated)<br>

3. use Lombok  annotation-> @getter  , @setter , @noArgsContructor and @allArgsConstructor for automate gettersetters and constructors<br> 

4. use db annotation @Entity ,@Table(name="products") , @Id  -> for primary key and 
@GeneratedValue(strategy = GenerationType.IDENDITY)<br> 

5. Use hibernate annotation @CreationTimeStamp and @UpdateTimeStamp

6. Create productRepository interface and extends the ENTITY and its primary key (<Product, Long>)

7. In repository create query method that return List of products
  * <br> List<Product> searchProducts(String query);
  * add annotation @Query("Select  p FROM Product") 

8. Create Services interface and create method List<Product> searchProducts(String query);   

9. Create Service impl/implementation class and implements services<name of serive>(ProductService)

10. override/ right Click, add unimplemented method and use @Service annotation

11. inject product repository  and right click to generate constructor

