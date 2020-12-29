package id.ac.amikom.apppado.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import id.ac.amikom.apppado.R
import id.ac.amikom.apppado.data.model.News
import id.ac.amikom.apppado.databinding.ItemNewsBinding
import id.ac.amikom.apppado.ui.base.BaseAdapter

class NewsAdapter(val context: Context) : BaseAdapter<News>(R.layout.item_news) {
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewsBinding
        Glide.with(context).load(data.poster).into(mBinding.itemPoster)
    }

    override fun onClick(binding: ViewDataBinding?, data: News) {
        val intent = Intent(context, NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS,data)
        context.startActivity(intent)
    }
}