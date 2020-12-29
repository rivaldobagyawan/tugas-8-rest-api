package id.ac.amikom.apppado.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.amikom.apppado.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
    companion object{
        const val OPEN_NEWS = "open_news"
    }
}