package com.example.sub

class ProductListActivity : AppCompatActivity() {
    private lateinit var db: FirebaseFirestore
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        db = FirebaseFirestore.getInstance()

        val recyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ProductAdapter()
        recyclerView.adapter = adapter

        db.collection("products").get()
            .addOnSuccessListener { result ->
                val products = result.map { it.toObject(Product::class.java) }
                adapter.submitList(products)
            }
    }
}
