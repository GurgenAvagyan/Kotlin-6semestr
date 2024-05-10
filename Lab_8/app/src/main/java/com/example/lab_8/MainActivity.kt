package com.example.lab_8

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Vertical RecyclerView
        binding.recyclerViewVert.layoutManager = LinearLayoutManager(this)
        val carData = listOf(
            Pair("Audi", "https://upload.wikimedia.org/wikipedia/commons/1/1d/Audi_A3_8Y_Sedan_IMG_5936.jpg"),
            Pair("Mercedes", "https://www.mercedes-benz.nl/content/netherlands/nl/passengercars/models/coupe/c236-23-2/overview/_jcr_content/root/responsivegrid/simple_stage_copy.component.damq1.3407431828339.jpg/mercedes-benz-cle-coupe-c236-stage-3840x3840-06-2023.jpg"),
            Pair("BMW", "https://www.bmw.nl/content/dam/bmw/common/all-models/m-series/series-overview/bmw-m-series-seo-overview-ms-04.jpg"),
            Pair("Toyota", ""),
            Pair("Volkswagen", "https://assets.whichcar.com.au/image/private/s--O0n92QGq--/c_fill,f_auto,g_xy_center,q_auto:good,x_1683,y_856/c_scale,w_800/2022_Volkswagen_Tiguan_Allspace_Life_110_TSI_white_SUV_3.jpg"),
            Pair("Ferrari", "https://media.nu.nl/m/5tsxy0na4mb7_wd854/ferrari.jpg"),
            Pair("Lamborghini", "https://s3-prod-europe.autonews.com/s3fs-public/Lamborghini%20Huracan%20STO%20web.jpg"),
            Pair("Bentley", null),
        )
        val adapter = CarAdapter(carData){ position: Int ->
//            Toast.makeText(this, carData[position].first, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CarDetailsActivity::class.java)
            intent.putExtra("carName", carData[position].first)
            startActivity(intent)
        }
        binding.recyclerViewVert.adapter = adapter

        // Horizontal RecyclerView
        binding.recyclerViewHor.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val textData = listOf(
            "Audi",
            "Mercedes",
            "BMW",
            "Toyota",
            "Volkswagen",
            "Ferrari",
            "Lamborghini",
            "Bentley"
        )
        val adapterSecond = HorizontalViewAdapter(textData)
        binding.recyclerViewHor.adapter = adapterSecond

    }
}