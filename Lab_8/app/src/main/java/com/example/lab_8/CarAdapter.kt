package com.example.lab_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab_8.databinding.RecycleViewBinding


class CarAdapter (private val items: List<Pair<String, String?>>,
                  private val onItemClick: (position: Int) -> Unit):
                    RecyclerView.Adapter<CarAdapter.CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        val binding = RecycleViewBinding.inflate(LayoutInflater.from(parent.context))
        return CarHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        val carName = items[position]
        holder.bind(carName.first, carName.second)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    // Holds the views for adding it to image and text
    class CarHolder(private val binding: RecycleViewBinding,
                    private val onItemClick: (position: Int) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {
            init {
                binding.buttonCar.setOnClickListener {
                    onItemClick(adapterPosition)
                }
            }

            fun bind(carName: String, imageUrl: String?) {
                Glide.with(binding.imageView)
                    .load(imageUrl)
                    .centerCrop()
                    .placeholder(binding.imageView.drawable)
                    .error(R.drawable.ic_launcher_background)
                    .fallback(R.drawable.ic_launcher_foreground)
                    .into(binding.imageView)
                binding.buttonCar.text = carName
        }
    }
}