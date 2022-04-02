package org.d3if4130.ass1_6706204130_tiara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import org.d3if4130.ass1_6706204130_tiara.databinding.ActivityHitungCicilanBinding

class HitungCicilanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHitungCicilanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungCicilanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.periksaButton.setOnClickListener(){
            if(binding.editTextNumber.text.isEmpty()){
                Toast.makeText(this, "Isi terlebih dahulu harga mobil", Toast.LENGTH_SHORT).show()
            }else {
                if (binding.tenorTextField.text.isEmpty()) {
                    Toast.makeText(this, "Isi terlebih dahulu tenor pinjaman", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    if (binding.bungaTF.text.isEmpty()) {
                        Toast.makeText(
                            this,
                            "Isi terlebih dahulu bunga pinjaman",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        if (binding.dpTF.text.isEmpty()) {
                            Toast.makeText(
                                this,
                                "Isi terlebih dahulu uang muka/dp pinjaman",
                                Toast.LENGTH_SHORT
                            ).show()
                        }else{
                            Toast.makeText(
                                this,
                                "Coming Soon",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }
                }
            }
        }
    }
    fun getDataHasil(){



        var getHarga = binding.editTextNumber.text.toString()
        var getTenor =  binding.tenorTextField.text.toString()
        var getBunga = binding.bungaTF.text.toString()
        var getDP = binding.dpTF.text.toString()

        var caseGetharga = getHarga.toLong()
        var caseGetBunga = getBunga.toDouble()
        var caseGetTenor = getTenor.toInt()
        var caseGetDp = getDP.toLong()


        val uangMuka : Long = (caseGetDp * caseGetharga) / 100
        val tenorBulan : Int = caseGetTenor * 12
        val bungaBulan : Double = caseGetBunga / 12


        val totalPinjaman : Long = caseGetharga - uangMuka
        val angsuranPerBulan : Long = totalPinjaman/tenorBulan
        val bungaPerbulan : Double = totalPinjaman/(bungaBulan* 0.01)
        Log.d("MainActivity","$uangMuka")

    }
}


