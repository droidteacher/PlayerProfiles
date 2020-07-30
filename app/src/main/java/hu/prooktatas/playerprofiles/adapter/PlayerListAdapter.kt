package hu.prooktatas.playerprofiles.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hu.prooktatas.playerprofiles.R
import hu.prooktatas.playerprofiles.model.Player

interface PlayerItemClickHandler {
    fun itemClicked(name: String)
}

class PlayerListAdapter(val players: List<Player>, val clickHandler: PlayerItemClickHandler): RecyclerView.Adapter<PlayerViewHolder>(), View.OnClickListener {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.player_item_row, parent, false)
        return PlayerViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return players.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val currentItem = players[position]
        val ctx = holder.imageView.context
        holder.imageView.setImageDrawable(ctx.resources.getDrawable(currentItem.imgRes))
        holder.nameTextView.text = currentItem.name
        holder.clubTextView.text = currentItem.club

        holder.itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        clickHandler.itemClicked(v?.findViewById<TextView>(R.id.playerItemName)?.text.toString())
    }

}

class PlayerViewHolder(v: View): RecyclerView.ViewHolder(v) {
    val imageView = v.findViewById<ImageView>(R.id.playerItemImage)
    val nameTextView = v.findViewById<TextView>(R.id.playerItemName)
    val clubTextView = v.findViewById<TextView>(R.id.playerItemClub)
}