package com.example.sub

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            val email = findViewById<EditText>(R.id.emailEditText).text.toString()
            val password = findViewById<EditText>(R.id.passwordEditText).text.toString()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, ProductListActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, "Login falhou!", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        findViewById<TextView>(R.id.registerTextView).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
