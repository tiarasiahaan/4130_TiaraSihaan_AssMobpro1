package org.d3if4130.ass1_6706204130_tiara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.smarteist.autoimageslider.SliderView
import org.d3if4130.ass1_6706204130_tiara.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageSlider = findViewById<SliderView>(R.id.imageSlider)
        val imageList: ArrayList<String> = ArrayList()
        imageList.add("https://www.otoflik.com/wp-content/uploads/2020/09/Tempat-Kredit-Mobil-Bekas-Termurah-DP-Ringan.jpg")
        imageList.add("https://images.bisnis-cdn.com/posts/2020/04/02/1221389/03032020-bio-penjualan-mobil-bekas-2.jpg")
        imageList.add("https://asset.kompas.com/crops/vjxmtlpRO0q7d8U6mwjg3yR4FBo=/141x0:985x563/750x500/data/photo/2018/12/06/3170263203.jpeg")
        imageList.add("https://1.bp.blogspot.com/-jvgEXXVs5jc/XsDCtgR7ZQI/AAAAAAAAbTc/lNk-NI5JFkERY4W1zGIfXDKCEdx6hGTngCLcBGAsYHQ/s1600/2-min.jpg")
        imageList.add("https://blogspr.mocil.id/wp-content/uploads/2020/12/kredit-mobil-bekas-bandung.jpg")

        setImageInSlider(imageList, imageSlider)


        binding.button.setOnClickListener(){
            val i = Intent(this, HitungCicilanActivity::class.java)
            startActivity(i)
        }
        binding.buttonListMobil.setOnClickListener(){
            Toast.makeText(
                this,
                "Coming Soon",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setImageInSlider(images: ArrayList<String>, imageSlider: SliderView) {
        val adapter = MySliderImageAdapter()
        adapter.renewItems(images)
        imageSlider.setSliderAdapter(adapter)
        imageSlider.isAutoCycle = true
        imageSlider.startAutoCycle()
    }
}