package com.example.demo;

public class IntEpam {

/*	To implement the processSummary() method using JPA, your goal is to:

		Fetch data from the product and category tables.

		Create a list of ProductSummary objects (with category name and current timestamp).

		Group the summaries by productName (note: it looks like you have a typo in the field name — it should be productName, not proudctnName).

		Return a Map<String, List<ProductSummary>> where the key is productName.

		Step-by-Step:
		First, correct your class definitions and naming issues:

		java
		Copy
		Edit
		@Entity
		class Product {
		    @Id
		    private Long id;

		    private String productName;

		    private Long categoryId;

		    private Double price;
		}

		@Entity
		class Category {
		    @Id
		    private Long id;

		    private String categoryName;
		}

		class ProductSummary {
		    private Long id;
		    private String productName;
		    private Double price;
		    private String categoryName;
		    private LocalDateTime processedAt;

		    // constructor, getters, setters
		    public ProductSummary(Long id, String productName, Double price, String categoryName, LocalDateTime processedAt) {
		        this.id = id;
		        this.productName = productName;
		        this.price = price;
		        this.categoryName = categoryName;
		        this.processedAt = processedAt;
		    }

		    // Getters and setters can be added here or use Lombok
		}
		JPA Repository
		java
		Copy
		Edit
		public interface ProductRepository extends JpaRepository<Product, Long> {
		    @Query("SELECT p.id, p.productName, p.price, c.categoryName FROM Product p JOIN Category c ON p.categoryId = c.id")
		    List<Object[]> fetchProductSummaries();
		}
		Service Implementation
		java
		Copy
		Edit
		@Service
		public class ServiceImpl {

		    @Autowired
		    private ProductRepository productRepository;

		    public Map<String, List<ProductSummary>> processSummary() {
		        List<Object[]> results = productRepository.fetchProductSummaries();
		        Map<String, List<ProductSummary>> summaryMap = new HashMap<>();

		        for (Object[] row : results) {
		            Long id = (Long) row[0];
		            String productName = (String) row[1];
		            Double price = (Double) row[2];
		            String categoryName = (String) row[3];

		            ProductSummary summary = new ProductSummary(
		                id,
		                productName,
		                price,
		                categoryName,
		                LocalDateTime.now()
		            );

		            summaryMap.computeIfAbsent(productName, k -> new ArrayList<>()).add(summary);
		        }

		        return summaryMap;
		    }
		}
		Notes
		Use @Entity annotations if you haven’t already.

		Consider using DTO projections or JPA interfaces for cleaner queries.

		You can also use @ManyToOne relationship mapping if you're open to refactoring.

		Would you like a version using entity relationships (@ManyToOne) instead of manual joins?







		You said:
		using without productRespostiy we hav two reposity one is proudct and categrorty 


		ChatGPT said:
		Thanks for the clarification! Since you have two separate repositories: ProductRepository and CategoryRepository, and you don’t want to use a custom JPQL query, we can implement the logic using basic JPA methods (like findAll()), and perform the joining logic in Java.

		✅ Assumptions:
		You have ProductRepository and CategoryRepository.

		You want to:

		Fetch all Product records.

		For each Product, find the corresponding Category using categoryId.

		Build a ProductSummary.

		Group by productName.

		✅ Final Implementation
		✅ Repositories:
		java
		Copy
		Edit
		public interface ProductRepository extends JpaRepository<Product, Long> {}

		public interface CategoryRepository extends JpaRepository<Category, Long> {}
		✅ Service Implementation:
		java
		Copy
		Edit
		@Service
		public class ServiceImpl {

		    @Autowired
		    private ProductRepository productRepository;

		    @Autowired
		    private CategoryRepository categoryRepository;

		    public Map<String, List<ProductSummary>> processSummary() {
		        List<Product> products = productRepository.findAll();
		        List<Category> categories = categoryRepository.findAll();

		        // Build a lookup map of categoryId → categoryName
		        Map<Long, String> categoryMap = categories.stream()
		                .collect(Collectors.toMap(Category::getId, Category::getCategoryName));

		        // Build the summary list
		        List<ProductSummary> summaries = products.stream()
		                .map(product -> new ProductSummary(
		                        product.getId(),
		                        product.getProductName(),
		                        product.getPrice(),
		                        categoryMap.get(product.getCategoryId()),
		                        LocalDateTime.now()
		                ))
		                .collect(Collectors.toList());

		        // Group by productName
		        return summaries.stream()
		                .collect(Collectors.groupingBy(ProductSummary::getProductName));
		    }
		}
		✅ Summary Class:
		java
		Copy
		Edit
 		public class ProductSummary {
		    private Long id;
		    private String productName;
		    private Double price;
		    private String categoryName;
		    private LocalDateTime processedAt;

		    public ProductSummary(Long id, String productName, Double price, String categoryName, LocalDateTime processedAt) {
		        this.id = id;
		        this.productName = productName;
		        this.price = price;
		        this.categoryName = categoryName;
		        this.processedAt = processedAt;
		    }

		    // Getters and setters...
		}
		✅ Fix your entities (typo corrections):
		java
		Copy
		Edit
		@Entity
		public class Product {
		    @Id
		    private Long id;

		    private String productName;
		    private Long categoryId;
		    private Double price;

		    // Getters and setters...
		}

		@Entity
		public class Category {
		    @Id
		    private Long id;

		    private String categoryName;

		    // Getters and setters...
		}
*/
}
