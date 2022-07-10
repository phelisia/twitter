package dev.phelisia.twitterreplica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterAdapter(var TwitterList: List<TwittterItem>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=TwitterList.get(position)
        holder.tvname.text=currentTwitter.name
        holder.tvHandle.text=currentTwitter.handle
        holder.tvTweet.text=currentTwitter.tweet
        holder.tvHour.text=currentTwitter.time



    }

    override fun getItemCount(): Int {
        return  TwitterList.size
    }
}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvHour=itemView.findViewById<TextView>(R.id.tvHour)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvtweet)
    var tvIMAGE=itemView.findViewById<ImageView>(R.id.ivpj)

}