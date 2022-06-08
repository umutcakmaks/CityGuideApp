package com.example.cityguideapp.script

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.cityguideapp.R
import com.example.cityguideapp.model.Categories
import com.example.cityguideapp.model.Place
import com.example.cityguideapp.viewmodel.CategoriesViewModel
import com.example.cityguideapp.viewmodel.PlaceViewModel
import kotlinx.android.synthetic.main.activity_script_data.*

class ScriptDataActivity : AppCompatActivity() {


    private lateinit var mCategoriesViewModel: CategoriesViewModel

    private lateinit var mPlaceViewModel: PlaceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_script_data)

        mCategoriesViewModel = ViewModelProvider(this).get(CategoriesViewModel::class.java)
        mPlaceViewModel = ViewModelProvider(this).get(PlaceViewModel::class.java)

        btn_create_category.setOnClickListener {
            runAddCategories()
        }

        btn_create_category1.setOnClickListener {
            runAddCategories1()
        }

        btn_create_category2.setOnClickListener {
            runAddCategories2()
        }

        btn_create_category3.setOnClickListener {
            runAddCategories3()
        }

        btn_create_category4.setOnClickListener {
            runAddCategories4()
        }
        btn_create_category5.setOnClickListener {
            runAddCategories5()
        }
        btn_create_category6.setOnClickListener {
            runAddCategories6()
        }

        btn_create_place.setOnClickListener {
            runAddPlaces()
        }

        back_pressed.setOnClickListener {
            super.onBackPressed()
        }
    }






    //simple to create category
    fun runAddCategories() {
        val name = "Historical Place"
        val desc = "There are alot historical places around here"
        val image = "historical_image"
        val color = "#d4cbe5"
        val category = Categories(0, name, desc, image, color)
        mCategoriesViewModel.addCategory(category)
        Toast.makeText(this, "Added Historical Place ", Toast.LENGTH_SHORT).show()
    }

    //simple to create category
    fun runAddCategories1() {
        val name1 = "Parks"
        val desc1 = "Car Rents place to visit in this city"
        val image1 = "park_image"
        val color1 = "#947AE8"
        val category1 = Categories(0, name1, desc1, image1, color1)
        mCategoriesViewModel.addCategory(category1)
        Toast.makeText(this, "Added Parks ", Toast.LENGTH_SHORT).show()
    }

    //simple to create category
    fun runAddCategories2() {
        val name2 = "Hotels"
        val desc2 = "The best sleeping place"
        val image2 = "hotel_image"
        val color2 = "#7adccf"
        val category2 = Categories(0, name2, desc2, image2, color2)
        mCategoriesViewModel.addCategory(category2)
        Toast.makeText(this, "Added Hotels", Toast.LENGTH_SHORT).show()
    }

    //simple to create category
    fun runAddCategories3() {
        val name3 = "Library"
        val desc3 = "School and unviersity"
        val image3 = "library_image"
        val color3 = "#f7c59f"
        val category3 = Categories(0, name3, desc3, image3, color3)
        mCategoriesViewModel.addCategory(category3)
        Toast.makeText(this, "Added Library", Toast.LENGTH_SHORT).show()
    }

    //simple to create category
    fun runAddCategories4() {
        val name4 = "Prayer Room"
        val desc4 = "There are alot prayer room  around here"
        val image4 = "prayerRoom_image"
        val color4 = "#b8d7f5"
        val category4 = Categories(0, name4, desc4, image4, color4)
        mCategoriesViewModel.addCategory(category4)
        Toast.makeText(this, "Added Prayer Room", Toast.LENGTH_SHORT).show()
    }
    //simple to create category
    fun runAddCategories5() {
        val name5 = "Parking"
        val desc5 = "There are alot parking around here"
        val image5 = "parking_image"
        val color5 = "#947AE8"
        val category5 = Categories(0, name5, desc5, image5, color5)
        mCategoriesViewModel.addCategory(category5)
        Toast.makeText(this, "Added Parking", Toast.LENGTH_SHORT).show()
    }
    //simple to create category
    fun runAddCategories6() {
        val name6 = "Supermarkets"
        val desc6 = "There are alot mall around here"
        val image6 = "supermarket_image"
        val color6 = "#d4cbe5"
        val category6 = Categories(0, name6, desc6, image6, color6)
        mCategoriesViewModel.addCategory(category6)
        Toast.makeText(this, "Added Supermarkets", Toast.LENGTH_SHORT).show()
    }

    //Simple input Place to table
    fun runAddPlaces() {
        val place_name = "Dupnisa Cave"
        val place_desc = "Dupnisa Cave, which was formed about 180 million years ago, consists of two interconnected two floors and three caves that developed within the marbles. The upper floor of the system, which has a total length of 2720 meters, is composed of the Kuru and Kız caves. Sulu Cave is located 50-60 meters below these caves that have completed their development. Large complex of 3 caves with underground rivers, walking paths and impressive rock formations."
        val phone = "+90 (288)-214-31-77"
        val address = "Sarpdere Köyü İç Yolu, 39500 Sarpdere Köyü/Demirköy/Kırklareli Merkez/Kırklareli"
        val star_point = "4.6"
        val feature = 1
        val open_time = "08:30"
        val close_time = "18:30"
        val day_open = "7day"
        val day_close = "No"
        val uimage_url = "https://cdn.discordapp.com/attachments/772764979803717652/983794436301525092/20190729113833498_28012013_18099a14_ae6b_4f35_bc83_e91e3e4eb882.jpg"
        val map_url = "https://www.google.com/maps/place/Dupnisa+Mağarası/@41.8406536,27.5532801,17z/data=!3m1!4b1!4m5!3m4!1s0x40a0c83815555555:0xbe2b973eee7330e7!8m2!3d41.8406536!4d27.5554688"
        val website = "https://www.kulturportali.gov.tr/turkiye/kirklareli/gezilecekyer/dupnisa-magarasi"
        val review = "Nice place have time with family"
        val category_id = 1
        val place = Place(
            0,
            place_name,
            place_desc,
            phone,
            address,
            star_point,
            feature,
            open_time,
            close_time,
            day_open,
            day_close,
            uimage_url,
            map_url,
            website,
            review,
            category_id
        )

        val place_name1 = "Atatürk's Home"
        val place_desc1 = "Childhood home of soldier and leader Kemal Atatürk, known as the founder of Turkey. Kırklareli Atatürk House is architecturally identical to the Atatürk House in Thessaloniki, and attention has been paid to the smallest detail in the arrangement of the rooms. Inside the house are the cutlery, pitcher, oilpots that Mustafa Kemal Atatürk used on his visit to Kırklareli on December 20, 1930, the war map he used in Afyon Kocatepe, and the chair he used when he served as Military Attaché in Sofia, Bulgaria."
        val phone1 = "(288) 214-58-78"
        val address1 = "Yayla, Yayla Cd., 39000 Kırklareli Merkez/Kırklareli"
        val star_point1 = "4.8"
        val feature1 = 1
        val open_time1 = "09:30"
        val close_time1 = "17:30"
        val day_open1 = "7day"
        val day_close1 = "No"
        val uimage_url1 = "https://cdn.discordapp.com/attachments/772764979803717652/983796433419382834/photo0jpg.jpg"
        val map_url1 = "https://www.google.com/maps/dir//atatürk+evi+kırklareli/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a75314ea919039:0xdd78506cb358cb16?sa=X&ved=2ahUKEwifrcPy95v4AhWNP-wKHWjQCywQ9Rd6BAhtEAU"
        val website1 = "https://www.ataturkevikirklareli.com/"
        val review1 = "Have a good experience"
        val category_id1 = 1
        val place1 = Place(
            0,
            place_name1,
            place_desc1,
            phone1,
            address1,
            star_point1,
            feature1,
            open_time1,
            close_time1,
            day_open1,
            day_close1,
            uimage_url1,
            map_url1,
            website1,
            review1,
            category_id1
        )

        val place_name3 = "Pınarhisar Castle"
        val place_desc3 = "Kırklareli Pınarhisar Castle is considered to have been built during the Byzantine Period and was repaired during the Ottoman Period. The castle is located in the north of the district on a hill with no construction and dominating the environment. As a continuation of the castle, it was seen that the city walls leading down to the town center were destroyed. In the north of the district, there are two circular and one nearly square rectangular plan on the hill, and four circular bastions are mostly standing in the center of the district."
        val phone3 = "(000) 000-00-00"
        val address3 = "Camiikebir, 39300 Pınarhisar/Kırklareli"
        val star_point3 = "4.0"
        val feature3 = 1
        val open_time3 = "24Hour"
        val close_time3 = "No"
        val day_open3 = "7day"
        val day_close3 = "No"
        val uimage_url3 = "https://cdn.discordapp.com/attachments/772764979803717652/983797878755586099/534.jpg"
        val map_url3 = "https://www.google.com.tr/maps/place/Pınarhisar+Kalesi/@41.6292822,27.5151931,15z/data=!4m5!3m4!1s0x0:0xf0426749365df02b!8m2!3d41.6292822!4d27.5151931?hl=tr"
        val website3 = "http://www.kirklarelienvanteri.gov.tr/sitler.php?id=236"
        val review3 = "Have a good experience"
        val category_id3 = 1
        val place3 = Place(
            0,
            place_name3,
            place_desc3,
            phone3,
            address3,
            star_point3,
            feature3,
            open_time3,
            close_time3,
            day_open3,
            day_close3,
            uimage_url3,
            map_url3,
            website3,
            review3,
            category_id3
        )

        val place_name4 = "Kıyıköy"
        val place_desc4 = "Kıyıköy is a coastal town within the borders of Kırklareli province and connected to the Vize district. On 17 December 1986, it became a municipality by taking the status of municipality."
        val phone4 = "(000) 000-00-00"
        val address4 = "Kıyıköy, 39400 Kıyıköy/Vize/Kırklareli"
        val star_point4 = "4.5"
        val feature4 = 0
        val open_time4 = "24Hour"
        val close_time4 = "No"
        val day_open4 = "7day"
        val day_close4 = "No"
        val uimage_url4 = "https://cdn.discordapp.com/attachments/772764979803717652/983799294891012126/39400_Kykoy-Vize-Krklareli_Turkey_-_panoramio.jpg"
        val map_url4 = "https://www.google.com.tr/maps/place/Kıyıköy,+39400+Kıyıköy%2FVize%2FKırklareli/@41.6384995,28.089951,15z/data=!3m1!4b1!4m5!3m4!1s0x40a089f42341bebb:0xe867cf481157adb9!8m2!3d41.6385!4d28.089951"
        val website4 = "https://tr.wikipedia.org/wiki/K%C4%B1y%C4%B1k%C3%B6y,_Vize"
        val review4 = "Wonderful seaside town"
        val category_id4 = 1
        val place4 = Place(
            0,
            place_name4,
            place_desc4,
            phone4,
            address4,
            star_point4,
            feature4,
            open_time4,
            close_time4,
            day_open4,
            day_close4,
            uimage_url4,
            map_url4,
            website4,
            review4,
            category_id4
        )

        val place_name5 = "Igneada Longoz Forests National Park"
        val place_desc5 = "Longoz (subasar) type forest area; It is a forested area that is mostly covered with water in the spring-winter season when the amount of precipitation is high. Longoz Forests National Park, located in Igneada Town of Demirkoy District of Kirklareli Province, is located on the Black Sea coastline close to the Bulgarian border and covers an area of 3155 hectares. As a result of the decision of the Council of Ministers, the area was published in the Official Gazette on 13.11.2007 and registered as the 39th National Park of our country. The town of Igneada, where the National Park is located, is 27 km from Demirkoy, 97 km from Kırklareli city center, and 237 km from Istanbul."
        val phone5 = "(000) 000-00-00"
        val address5 = "Hamdibey, D565 No:32, 39500 İğneada/Demirköy/Kırklareli"
        val star_point5 = "4.5"
        val feature5 = 1
        val open_time5 = "24Hour"
        val close_time5 = "No"
        val day_open5 = "7day"
        val day_close5 = "No"
        val uimage_url5 = "https://cdn.discordapp.com/attachments/772764979803717652/983803290233999440/igneada-longoz-forests-national-park-turkey-longoz-forests-rare-ecosystems-main-condition-continuity-160169961.jpg"
        val map_url5 = "https://www.google.com/maps/dir//Igneada+Longoz+Ormanları+Milli+Parkı/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a0ec1a9ed825d5:0xe6dba22497ddfb19?sa=X&ved=2ahUKEwiE65bu_Zv4AhUGDewKHc_CAhQQ9Rd6BAhmEAQ"
        val website5 = "http://igneada.tabiat.gov.tr/"
        val review5 = "A national park in Turkey"
        val category_id5 = 2
        val place5 = Place(
            0,
            place_name5,
            place_desc5,
            phone5,
            address5,
            star_point5,
            feature5,
            open_time5,
            close_time5,
            day_open5,
            day_close5,
            uimage_url5,
            map_url5,
            website5,
            review5,
            category_id5
        )

        val place_name6 = "Kavaklimeşe Grove Nature Park"
        val place_desc6 = "Kavaklımeşe Grove Nature Park was established on 11.07.2011 at 35,55 Ha. announced in the field. The field is in the Central District, Kavaklı Town. It is a daily usage area and is 12 km from the city center. It is on the Kırklareli-Babaeski Road."
        val phone6 = "(000) 000-00-00"
        val address6 = "Turist, 39160 Kavaklı/Kırklareli Merkez/Kırklareli"
        val star_point6 = "4.2"
        val feature6 = 1
        val open_time6 = "24Hour"
        val close_time6 = "No"
        val day_open6 = "7day"
        val day_close6 = "No"
        val uimage_url6 = "https://cdn.discordapp.com/attachments/772764979803717652/983803508220371016/getlstd-property-photo.jpg"
        val map_url6 = "https://www.google.com/maps/dir//Kavaklımeşe+Korusu+Tabiat+Parkı/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14b4aa9f78692281:0xa7857dd49987ed26?sa=X&ved=2ahUKEwjZutim_5v4AhVLDOwKHQEjADwQ9Rd6BAhJEAM"
        val website6 = "http://kavaklimesekorusu.tabiat.gov.tr/"
        val review6 = "A national park in Kırklareli"
        val category_id6 = 2
        val place6 = Place(
            0,
            place_name6,
            place_desc6,
            phone6,
            address6,
            star_point6,
            feature6,
            open_time6,
            close_time6,
            day_open6,
            day_close6,
            uimage_url6,
            map_url6,
            website6,
            review6,
            category_id6
        )
        val place_name7 = "Iğneada Resort Hotel & Spa"
        val place_desc7 = "Igneada Resort Hotel & Spa, which you will encounter while examining the list of Igneada hotels, which has one of the most magnificent doors to Europe, which has managed to attract attention with its culture and nature, welcomes its guests with all its beauty. The facility, which gives you the comfort of your home, is 215 km from Istanbul Airport, 100 km from Kırklareli city center and 120 km from Edirne city center. The facility, where you will experience unforgettable memories among these hidden beauties hidden in the Yıldız Mountains and Longoz Forests, and renew your soul with its clean air in the heart of nature, serves as half board."
        val phone7 = "(0288) 692 20 20"
        val address7 = "Deniz Mah Sahil Cad No: 3 İğneada | Demirköy | Kırklareli"
        val star_point7 = "5.0"
        val feature7 = 1
        val open_time7 = "24Hour"
        val close_time7 = "No"
        val day_open7 = "7day"
        val day_close7 = "No"
        val uimage_url7 = "https://cdn.discordapp.com/attachments/772764979803717652/983827531536957520/igneada-resort-otel-genel-gorunum-12299.jpg"
        val map_url7 = "https://www.google.com/maps/place/İğneada+Resort+Hotel+%26+SPA/@41.8764882,27.9853867,17z/data=!3m1!4b1!4m8!3m7!1s0x40a0e8b9b4c90bad:0xc0a1992d71f53a57!5m2!4m1!1i2!8m2!3d41.8764882!4d27.9875754"
        val website7 = "https://otelleri.net/hotel/igneada-resort"
        val review7 = "Seafront, 125 meters private bay, sandy beach"
        val category_id7 = 3
        val place7 = Place(
            0,
            place_name7,
            place_desc7,
            phone7,
            address7,
            star_point7,
            feature7,
            open_time7,
            close_time7,
            day_open7,
            day_close7,
            uimage_url7,
            map_url7,
            website7,
            review7,
            category_id7
        )

        val place_name9 = "Longosphere Glamping"
        val place_desc9 = "Igneada Longoz Forests, described as the hidden paradise of Thrace, is a unique treasure where blue and green come together with its beautiful nature, bird sounds and lakes in every season of the year."
        val phone9 = "444 5267"
        val address9 = "Yeni Mahalle , Sislioba Yolu No:8 İğneada, Demirköy KIRKLARELİ 39650"
        val star_point9 = "4.0"
        val feature9 = 1
        val open_time9 = "14:00"
        val close_time9 = "23:00"
        val day_open9 = "7day"
        val day_close9 = "No"
        val uimage_url9 = "https://cdn.discordapp.com/attachments/772764979803717652/983829308256682005/313.jpg"
        val map_url9 = "https://www.google.com/maps/dir//Longosphere+Glamping%0D%0Aİğneada,+Demirköy,+Kırklareli/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a0e982ee98fe6b:0xf2167c110d84deae?sa=X&ved=2ahUKEwikja2Qlpz4AhUDDuwKHadgCPAQ9Rd6BAhgEAU"
        val website9 = "https://longosphere.com"
        val review9 = "Unique Accommodation Experiences"
        val category_id9 = 3
        val place9 = Place(
            0,
            place_name9,
            place_desc9,
            phone9,
            address9,
            star_point9,
            feature9,
            open_time9,
            close_time9,
            day_open9,
            day_close9,
            uimage_url9,
            map_url9,
            website9,
            review9,
            category_id9
        )
        val place_name10 = "A101 Supermarket"
        val place_desc10 = "He is resisting the price hikes. The location is fine. But it would be better if they run the air conditioners more."
        val phone10 = "0850 808 2101"
        val address10 = "İstasyon, 1118. Sk. No:22 D:1, 39000 Kırklareli Merkez/Kırklareli"
        val star_point10 = "3.6"
        val feature10 = 0
        val open_time10 = "09:00"
        val close_time10 = "21:00"
        val day_open10 = "7day"
        val day_close10 = "No"
        val uimage_url10 = "https://cdn.discordapp.com/attachments/772764979803717652/983846177684463626/32041537_YOO8ikwTjMpsWI31f5qNY2Z-xxWvibEI6ibjrZa9rZU.jpg"
        val map_url10 = "https://www.google.com/maps/dir//K%C4%B1rklareli+a101/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a7534f020ea069:0xbeca0fa79acd0b68?sa=X&hl=tr&ved=2ahUKEwi7o4uQpJz4AhUCSfEDHc5zCi0Q9Rd6BAgFEAQ"
        val website10 = "https://www.a101.com.tr"
        val review10 = "A101 market"
        val category_id10 = 7
        val place10 = Place(
            0,
            place_name10,
            place_desc10,
            phone10,
            address10,
            star_point10,
            feature10,
            open_time10,
            close_time10,
            day_open10,
            day_close10,
            uimage_url10,
            map_url10,
            website10,
            review10,
            category_id10
        )

        val place_name11 = "Migros"
        val place_desc11 = "Migros big chain market"
        val phone11 = "0850 310 2516"
        val address11 = "Karacaibrahim, Merkez, Mustafa Kemal Blv. No:23, 39000 Kırklareli Merkez/Kırklareli"
        val star_point11 = "4.1"
        val feature11 = 1
        val open_time11 = "08:30"
        val close_time11 = "22:00"
        val day_open11 = "7day"
        val day_close11 = "No"
        val uimage_url11 = "https://cdn.discordapp.com/attachments/772764979803717652/983844949655162900/Screenshot_9.png"
        val map_url11 = "https://www.google.com/maps/dir/40.1728884,29.0808898/Karacaibrahim,+M+Migros,+Merkez,+Mustafa+Kemal+Blv.+No:23,+39000+Kırklareli+Merkez%2FKırklareli/@40.9465826,27.1944856,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x40a75342312b3ae3:0x534f8c108a4bffec!2m2!1d27.223782!2d41.731564"
        val website11 = "https://www.migros.com.tr/"
        val review11 = "Migros store"
        val category_id11 = 7
        val place11 = Place(
            0,
            place_name11,
            place_desc11,
            phone11,
            address11,
            star_point11,
            feature11,
            open_time11,
            close_time11,
            day_open11,
            day_close11,
            uimage_url11,
            map_url11,
            website11,
            review11,
            category_id11
        )

        val place_name12 = "Old Church"
        val place_desc12 = "The Old Church was built in 1858. No other information about the church could be found in the Land Registry, Prime Ministry Ottoman Archive documents, Turkish and Greek, and other written and visual sources."
        val phone12 = "(000) 000-00-00"
        val address12 = "İstasyon, 39000 Kırklareli Merkez/Kırklareli"
        val star_point12 = "3.6"
        val feature12 = 0
        val open_time12 = "24Hour"
        val close_time12 = "No"
        val day_open12 = "7day"
        val day_close12 = "No"
        val uimage_url12 = "https://cdn.discordapp.com/attachments/772764979803717652/983842894492368916/244.jpg"
        val map_url12 = "https://www.google.com/maps/place/Eski+Kilise/@40.9473558,27.1944856,8z/data=!4m19!1m13!4m12!1m4!2m2!1d29.0808898!2d40.1728884!4e1!1m6!1m2!1s0x40a7536ee4ce4e97:0x476e0318a078fbb!2skırklareli%27ndeki+kiliseler!2m2!1d27.2124978!2d41.7334589!3m4!1s0x40a7536ee4ce4e97:0x476e0318a078fbb!8m2!3d41.7334589!4d27.2124978?hl=tr"
        val website12 = "-"
        val review12 = "It's a nice place but it needs to be restored"
        val category_id12 = 5
        val place12 = Place(
            0,
            place_name12,
            place_desc12,
            phone12,
            address12,
            star_point12,
            feature12,
            open_time12,
            close_time12,
            day_open12,
            day_close12,
            uimage_url12,
            map_url12,
            website12,
            review12,
            category_id12
        )

        val place_name13 = "Kirklareli Museum"
        val place_desc13 = "You can visit this small but beautiful museum as it is one of the rare museums to be seen in Kırklareli, and the ethnographic elements and archaeological remains in and around Kırklareli can be examined."
        val phone13 = "(0288) 214 21 39"
        val address13 = "Karacaibrahim Mahallesi Mustafa Kemal Bulvarı No:26 / KIRKLARELİ"
        val star_point13 = "4.4"
        val feature13 = 0
        val open_time13 = "08:30"
        val close_time13 = "17:30"
        val day_open13 = "7day"
        val day_close13 = "No"
        val uimage_url13 = "https://cdn.discordapp.com/attachments/772764979803717652/983800718626553886/KrklareliMuzesiTrakyaGeziRehberi.jpg"
        val map_url13 = "https://www.google.com/maps/dir//Kırklareli+Müzesi/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a75341bf574901:0xcd230f67bf1ae98c?sa=X&ved=2ahUKEwjC6dL4_Jv4AhVB4qQKHRfSAW8Q9Rd6BAhbEAQ"
        val website13 = "https://www.kulturvarliklari.gov.tr/TR,44113/kirklareli-muze-mudurlugu.html"
        val review13 = "The building with ethnographic elements and archaeological remains"
        val category_id13 = 1
        val place13 = Place(
            0,
            place_name13,
            place_desc13,
            phone13,
            address13,
            star_point13,
            feature13,
            open_time13,
            close_time13,
            day_open13,
            day_close13,
            uimage_url13,
            map_url13,
            website13,
            review13,
            category_id13
        )

        val place_name14 = "Kadı Mosque"
        val place_desc14 = "It is located across Ahmet Mithat Primary School in the center of Kırklareli. The mosque, which was built by Emin Ali Çelebi in 1577 (H.985), is still in use and has a square plan. Pine, which is the property of the General Directorate of Foundations; It has an interior area of 93 square meters on a 457 square meter plot. It has a capacity of 200 people to worship at the same time."
        val phone14 = "(703) 243-5694"
        val address14 = "Doğu, 39050 Kırklareli Merkez/Kırklareli"
        val star_point14 = "4.1"
        val feature14 = 0
        val open_time14 = "7AM"
        val close_time14 = "10PM"
        val day_open14 = "7day"
        val day_close14 = "No"
        val uimage_url14 = "https://cdn.discordapp.com/attachments/772764979803717652/983841830007345182/download.jpg"
        val map_url14 = "https://www.google.com/maps/dir//Doğu,+Kadı+Ali+Cami,+39050+Kırklareli+Merkez%2FKırklareli/@41.7363647,27.2258345,15z/data=!4m8!4m7!1m0!1m5!1m1!1s0x40a7534001b8584b:0x787f0bf5b761fbcc!2m2!1d27.2258331!2d41.7363532?hl=tr"
        val website14 = "https://www.kulturportali.gov.tr/turkiye/kirklareli/gezilecekyer/kirklareli-kadi-camii"
        val review14 = "It's a beautiful little mosque, you should definitely visit it if you're on your way."
        val category_id14 = 5
        val place14 = Place(
            0,
            place_name14,
            place_desc14,
            phone14,
            address14,
            star_point14,
            feature14,
            open_time14,
            close_time14,
            day_open14,
            day_close14,
            uimage_url14,
            map_url1,
            website14,
            review14,
            category_id14
        )

        val place_name15 = "Aya Nikola Monastery"
        val place_desc15 = "Aya Nikola Monastery is one of the oldest stone carved monasteries in the world, located in the town of Vize, Kiyikoy, in the province of Kirklareli in Turkey. It belongs to the reign of Justinian I in the 6th century and is one of the best examples of rock monasteries."
        val phone15 = "(000) 000-00-00"
        val address15 = "39400 Kıyıköy/Vize/Kırklareli"
        val star_point15 = "4.1"
        val feature15 = 0
        val open_time15 = "24Hour"
        val close_time15 = "No"
        val day_open15 = "7day"
        val day_close15 = "No"
        val uimage_url15 = "https://cdn.discordapp.com/attachments/772764979803717652/983840272079269968/download.jpg"
        val map_url15 = "https://www.google.com/maps/place/Aya+Nikola+Manastırı/@40.8983861,27.5969021,8z/data=!4m19!1m13!4m12!1m4!2m2!1d29.0808898!2d40.1728884!4e1!1m6!1m2!1s0x40a089ed811acc95:0x16b84cd77f528b15!2skırklareli+kilise!2m2!1d28.0844465!2d41.6342938!3m4!1s0x40a089ed811acc95:0x16b84cd77f528b15!8m2!3d41.6342938!4d28.0844465?hl=tr"
        val website15 = "https://www.kirklarelienvanteri.gov.tr/anitlar.php?id=80"
        val review15 = "A place of worship and monks' resting place, carved with the chipping method of the 6th century Byzantine period."
        val category_id15 = 5
        val place15 = Place(
            0,
            place_name15,
            place_desc15,
            phone15,
            address15,
            star_point15,
            feature15,
            open_time15,
            close_time15,
            day_open15,
            day_close15,
            uimage_url15,
            map_url1,
            website15,
            review15,
            category_id15
        )

        val place_name16 = "Kırklareli Municipality Indoor Parking Lot"
        val place_desc16 = "Indoor Parking Lot"
        val phone16 = "05320121274"
        val address16 = "Karakaş, Zincirlikuyu 2. Geçidi Sk., 39000 Kırklareli Merkez/Kırklareli"
        val star_point16 = "4.1"
        val feature16 = 0
        val open_time16 = "24Hour"
        val close_time16 = "No"
        val day_open16 = "7day"
        val day_close16 = "No"
        val uimage_url16 = "https://cdn.discordapp.com/attachments/772764979803717652/983839195393048626/Screenshot_8.png"
        val map_url16 = "https://www.google.com/maps/place/Kırklareli+Belediyesi+Kapalı+Otoparkı/@40.9487473,27.1944856,8z/data=!4m19!1m13!4m12!1m4!2m2!1d29.0808898!2d40.1728884!4e1!1m6!1m2!1s0x40a7536b1b5a8605:0x58d52d0b34f73457!2skırklareli+belediyesi+kapalı+otopark!2m2!1d27.2212441!2d41.7360261!3m4!1s0x40a7536b1b5a8605:0x58d52d0b34f73457!8m2!3d41.7360261!4d27.2212441?hl=tr"
        val website16 = "msmbiowaste.com"
        val review16 = "Indoor Parking Lot"
        val category_id16 = 6
        val place16 = Place(
            0,
            place_name16,
            place_desc16,
            phone16,
            address16,
            star_point16,
            feature16,
            open_time16,
            close_time16,
            day_open16,
            day_close16,
            uimage_url16,
            map_url1,
            website16,
            review16,
            category_id16
        )

        val place_name17 = "Vilayet Square"
        val place_desc17 = "Visit the Provincial Square, located in the center of the city. In the square; There is the Governor's Mansion, Atatürk's statue on a horse, F-5 fighter plane and various figures."
        val phone17 = "(000) 000-00-00"
        val address17 = "Karakaş, İstiklal Cd. No:21202, 39000 Kırklareli Merkez/Kırklareli"
        val star_point17 = "4.4"
        val feature17 = 1
        val open_time17 = "24Hour"
        val close_time17 = "No"
        val day_open17 = "7day"
        val day_close17 = "No"
        val uimage_url17 = "https://cdn.discordapp.com/attachments/772764979803717652/983806499799330856/454062784_Vzo21WE3dC6NFq6de7SeQuHyEpt77dFFF7MxThCiQYM.jpg"
        val map_url17 = "https://www.google.com/maps/dir/40.1728884,29.0808898/Karaka%C5%9F,+Vilayet+Meydan%C4%B1,+%C4%B0stiklal+Cd.+No:21202,+39000+K%C4%B1rklareli+Merkez%2FK%C4%B1rklareli/@40.9474296,27.1944856,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x40a7536a2a89ab09:0x4905ba4836c0b1c9!2m2!1d27.2193484!2d41.7336102"
        val website17 = "https://tr.foursquare.com/v/vilayet-meydan%C4%B1/55fbec6e498e081c69b13891"
        val review17 = "Heart of the city"
        val category_id17 = 2
        val place17 = Place(
            0,
            place_name17,
            place_desc17,
            phone17,
            address17,
            star_point17,
            feature17,
            open_time17,
            close_time17,
            day_open17,
            day_close1,
            uimage_url17,
            map_url1,
            website17,
            review17,
            category_id17
        )

        val place_name18 = "Istasyon street"
        val place_desc18 = "Located in Kırklareli district center, Istasyon Street is where people come for long walks in the evenings. He enjoys walking along the street getting his ice cream. I should also mention that you reach the amusement park at the end of the street. The entrance gates of Kırklareli Atatürk Stadium are also located on this street. The street takes its name from the fact that the road is closed to traffic and the train station at the other end of the road. You have the chance to see the train tracks and the station, which are not actively used today. After walking around the street for a while, you can take a break at the places around and sip something."
        val phone18 = "(000) 000-00-00"
        val address18 = "Karakaş 39010 Kırklareli Merkez/Kırklareli"
        val star_point18 = "4.4"
        val feature18 = 1
        val open_time18 = "24Hour"
        val close_time18 = "No"
        val day_open18 = "7day"
        val day_close18 = "No"
        val uimage_url18 = "https://cdn.discordapp.com/attachments/772764979803717652/983807317009117214/20180422-180304-largejpg.jpg"
        val map_url18 = "https://www.google.com/maps/place/Karakaş,+İstasyon+Cd.,+39010+Kırklareli+Merkez%2FKırklareli/@41.732097,27.2147193,17z/data=!4m5!3m4!1s0x40a75369049083d9:0xa53edd6ad6eab18e!8m2!3d41.732097!4d27.216908?shorturl=1"
        val website18 = "https://eksisozluk.com/kirklareli-istasyon-caddesi--3899932"
        val review18 = "Good park"
        val category_id18 = 2
        val place18 = Place(
            0,
            place_name18,
            place_desc18,
            phone18,
            address18,
            star_point18,
            feature18,
            open_time18,
            close_time18,
            day_open18,
            day_close18,
            uimage_url18,
            map_url18,
            website18,
            review18,
            category_id18
        )

        val place_name19 = "Hızırbey Bedesten"
        val place_desc19 = "It is located in the center of Kırklareli, in Cumhuriyet Square. It is a part of the complex built by Köse Mihalzade Hızırbey in 1383 (H.785) and is included in the building group consisting of a bath and a mosque."
        val phone19 = "(000) 000-00-00"
        val address19 = "Karaumur Caddesi, Karakaş Mahallesi, Kırklareli/Merkez"
        val star_point19 = "3.9"
        val feature19 = 1
        val open_time19 = "8:30"
        val close_time19 = "19:30"
        val day_open19 = "7day"
        val day_close19 = "No"
        val uimage_url19 = "https://cdn.discordapp.com/attachments/772764979803717652/983809333475282974/824.jpg"
        val map_url19 = "https://www.google.com/maps/place/Arastra+bedesten/@41.7355515,27.2219656,17z/data=!3m1!4b1!4m5!3m4!1s0x40a7536a99824e95:0x5f4150e6e1c7630a!8m2!3d41.7355515!4d27.2241543"
        val website19 = "https://www.gezginrehberler.com/carsi-ve-hanlar/hizirbey-arastasi-bedesten-merkez-kirklareli/"
        val review19 = "Hızırbey Bedesten"
        val category_id19 = 2
        val place19 = Place(
            0,
            place_name19,
            place_desc19,
            phone19,
            address19,
            star_point19,
            feature19,
            open_time19,
            close_time19,
            day_open19,
            day_close19,
            uimage_url19,
            map_url19,
            website19,
            review19,
            category_id19
        )

        val place_name20 = "Kirklareli University Central Library"
        val place_desc20 = "Central Library"
        val phone20 = "(000) 000-00-00"
        val address20 = "39100 Eriklice/Kırklareli Merkez/Kırklareli"
        val star_point20 = "3.8"
        val feature20 = 0
        val open_time20 = "08:30"
        val close_time20 = "17:30"
        val day_open20 = "7day"
        val day_close20 = "No"
        val uimage_url20 = "https://cdn.discordapp.com/attachments/772764979803717652/983834673375502408/Screenshot_5.png"
        val map_url20 = "https://www.google.com/maps/dir//k%C4%B1rklareli+k%C3%BCt%C3%BCphaneleri/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a751c1a7619e95:0xa172e2f8596e8773?sa=X&ved=2ahUKEwiO8YnXmpz4AhUOjaQKHe8DChAQ9Rd6BAgOEAQ"
        val website20 = "https://kddb.klu.edu.tr/"
        val review20 = "Central Library"
        val category_id20 = 4
        val place20 = Place(
            0,
            place_name20,
            place_desc20,
            phone20,
            address20,
            star_point20,
            feature20,
            open_time20,
            close_time20,
            day_open20,
            day_close20,
            uimage_url20,
            map_url20,
            website20,
            review20,
            category_id20
        )

        val place_name21 = "Lozengrad Hotel"
        val place_desc21 = "Standing out as a luxurious, stylish and comfortable accommodation option for business or leisure stays in the city center of Kırklareli, Lozengrad Hotel draws an attentive image with its elegant architecture and tasteful decoration. The facility is equipped to meet all the expectations of its guests in its comfortable rooms of different sizes. The guests, who experience delicious food against the city view at the roof restaurant of the facility, enjoy a rich variety of menus throughout the day at the bar and patisserie."
        val phone21 = "(0288) 212 25 00"
        val address21 = "Karakaş, Mutlu Sk. No:2, 39000 Kırklareli Merkez/Kırklareli"
        val star_point21 = "5.0"
        val feature21 = 0
        val open_time21 = "14:00"
        val close_time21 = "00:00"
        val day_open21 = "7day"
        val day_close21 = "No"
        val uimage_url21 = "https://cdn.discordapp.com/attachments/772764979803717652/983830728859074620/61892522-750x500.jpg"
        val map_url21 = "https://www.google.com/maps/dir//Lozengrad+Hotel/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a7536bc10b22b7:0xbe7974e38d208b36?sa=X&ved=2ahUKEwi15oHZlpz4AhVJmqQKHbVuDK0Q9Rd6BAhhEAQ"
        val website21 = "https://lozengradhotel.com/"
        val review21 = "Opened in 2015, Lozengrad Hotel offers you peace and comfort in 50 tastefully furnished rooms."
        val category_id21 = 3
        val place21 = Place(
            0,
            place_name21,
            place_desc21,
            phone21,
            address21,
            star_point21,
            feature21,
            open_time21,
            close_time21,
            day_open21,
            day_close21,
            uimage_url21,
            map_url21,
            website21,
            review21,
            category_id21
        )

        val place_name22 = "Thrace Konak Hotel & SPA"
        val place_desc22 = "Thrace Konak Hotel & SPA welcomes its guests at a central point of Kırklareli. The facility, which opened its doors with the restoration of a 200-year-old historical Greek School, provides service in a stone mansion and wooden mansion in the same garden. Both buildings, which preserve their historical texture, draw attention with their high ceilings. Offering an authentic accommodation experience, the property welcomes its guests in simply decorated rooms. In the rooms of the facility; flat-screen TV, safe, free wireless internet, anti-allergic carpet and air conditioning. Guests can benefit from Turkish Bath, sauna and massage facilities in the SPA area of \u200B\u200Bthe facility. The property has an a la carte restaurant. It is possible to hold medium-sized meetings in this restaurant area. Guests staying at the property can start their day with a delicious breakfast. Those who wish can spend time in the cafe of the facility during the day. historical mansion; Atatürk House, Ali Rıza Efendi House, Turkish Hearth Building (Culture and Art House, etc.)"
        val phone22 = "(0288) 692 22 77"
        val address22 = "Yayla Mahallesi Yayla Caddesi, Mektep Sk. No:18 -20, 39000 Kırklareli Merkez/Kırklareli"
        val star_point22 = "4.0"
        val feature22 = 0
        val open_time22 = "24Hour"
        val close_time22 = "No"
        val day_open22 = "7day"
        val day_close22 = "No"
        val uimage_url22 = "https://cdn.discordapp.com/attachments/772764979803717652/983831353340604456/429c77dd-658c-4120-8f9b-4354ab26a063.jpg"
        val map_url22 = "https://www.google.com/maps/dir//Thrace+Konak+Hotel+%26+SPA/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x40a753c4e1bfe49d:0xfa5e26511128689d?sa=X&ved=2ahUKEwiFvKK6l5z4AhVHzKQKHSKuAsIQ9Rd6BAg-EAQ"
        val website22 = "https://www.thracekonak.com/"
        val review22 = "No Pets Allowed, Guide Dog Not Allowed, Extra Bed Provided"
        val category_id22 = 3
        val place22 = Place(
            0,
            place_name22,
            place_desc22,
            phone22,
            address22,
            star_point22,
            feature22,
            open_time22,
            close_time22,
            day_open22,
            day_close22,
            uimage_url22,
            map_url22,
            website22,
            review22,
            category_id22
        )

        val place_name23 = "KOLEKTIF LIBRARY"
        val place_desc23 = "Next generation library"
        val phone23 = "0539 288 77 18"
        val address23 = "İstasyon mahallesi, İstasyonaltı caddesi, Nursel Açıkgöz apt. No:6/12, 39100 MERKEZ/Kırklareli"
        val star_point23 = "4.8"
        val feature23 = 0
        val open_time23 = "09:00"
        val close_time23 = "00:00"
        val day_open23 = "7day"
        val day_close23 = "No"
        val uimage_url23 = "https://cdn.discordapp.com/attachments/772764979803717652/983832996580835448/1554984750709.jpg"
        val map_url23 = "https://www.google.com/maps/place/KOLEKT%C4%B0F+K%C3%9CT%C3%9CPHANE/@41.7304557,27.2106912,17.75z/data=!4m19!1m13!4m12!1m4!2m2!1d28.9865728!2d41.0517504!4e1!1m6!1m2!1s0x40a753b58c6dfe21:0x4e34052ef7c781cf!2zS09MRUtUxLBGIEvDnFTDnFBIQU5FLCDEsHN0YXN5b24gbWFoYWxsZXNpLCDEsHN0YXN5b25hbHTEsSBjYWRkZXNpLCBOdXJzZWwgQcOnxLFrZ8O2eiBhcHQuIE5vOjYvMTIsIDM5MTAwIE1FUktFWi9LxLFya2xhcmVsaQ!2m2!1d27.2117428!2d41.7316958!3m4!1s0x40a753b58c6dfe21:0x4e34052ef7c781cf!8m2!3d41.7316958!4d27.2117428"
        val website23 = "https://www.instagram.com/kolektifkutuphane"
        val review23 = "Next generation library"
        val category_id23 = 4
        val place23 = Place(
            0,
            place_name23,
            place_desc23,
            phone23,
            address23,
            star_point23,
            feature23,
            open_time23,
            close_time23,
            day_open23,
            day_close23,
            uimage_url23,
            map_url23,
            website23,
            review23,
            category_id23
        )

        val place_name24 = "ASIL YEDIEMIN PARKING"
        val place_desc24 = "Open Parking"
        val phone24 = "0288 212 30 50"
        val address24 = "Pınar Mah. Asilbeyli Köyü Yolu Kırklareli Merkez, Kırklareli"
        val star_point24 = "4.0"
        val feature24 = 0
        val open_time24 = "24Hour"
        val close_time24 = "No"
        val day_open24 = "7day"
        val day_close24 = "No"
        val uimage_url24 = "https://cdn.discordapp.com/attachments/772764979803717652/983837911738884126/Ackotopark.jpg"
        val map_url24 = "https://www.google.com/maps/dir//ASİL+YEDİEMİN+OTOPARKI/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x409d41d700588e0b:0x29da1bd8ed42f3df?sa=X&ved=2ahUKEwiWsJv3m5z4AhVKwKQKHVOWAbEQ9Rd6BAg8EAM"
        val website24 = "-"
        val review24 = "Open Parking"
        val category_id24 = 6
        val place24 = Place(
            0,
            place_name24,
            place_desc24,
            phone24,
            address24,
            star_point24,
            feature24,
            open_time24,
            close_time24,
            day_open24,
            day_close24,
            uimage_url24,
            map_url24,
            website24,
            review24,
            category_id24
        )

        val place_name25 = "Lüleburgaz Sokullu Mehmet Pasha District Public Library"
        val place_desc25 = "Next generation library"
        val phone25 = "(0288) 417 13 24"
        val address25= "Güneş, Baki Becer Sk. No: 11 D:13B, 39750 Lüleburgaz/Kırklareli"
        val star_point25 = "4.3"
        val feature25 = 0
        val open_time25 = "08:30"
        val close_time25 = "18:30"
        val day_open25 = "6day"
        val day_close25 = "Sunday"
        val uimage_url25 = "https://cdn.discordapp.com/attachments/772764979803717652/983835094118707260/Screenshot_6.png"
        val map_url25 = "https://www.google.com/maps/dir//kırklareli+kütüphaneleri/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14b4a4b5619d833f:0xfcd1134b32b4f114?sa=X&ved=2ahUKEwiO662Tmpz4AhUEs6QKHS2HD9AQ9Rd6BAgREAQ"
        val website25 = "https://sokullumehmetpasa.kutuphane.gov.tr"
        val review25 = "Library"
        val category_id25 = 4
        val place25 = Place(
            0,
            place_name25,
            place_desc25,
            phone25,
            address25,
            star_point25,
            feature25,
            open_time25,
            close_time25,
            day_open25,
            day_close25,
            uimage_url25,
            map_url25,
            website25,
            review25,
            category_id25
        )

        val place_name26 = "Onur Supermarket"
        val place_desc26 = "Onur Market for your online grocery shopping with the most affordable products, same day or appointment delivery opportunity"
        val phone26 = "(0288) 212 34 35"
        val address26= "Bademlik, Hastane Cd. 31/A, 39010 Kırklareli Merkez/Kırklareli"
        val star_point26 = "4.0"
        val feature26 = 0
        val open_time26 = "08:00"
        val close_time26 = "22:00"
        val day_open26 = "7day"
        val day_close26 = "No"
        val uimage_url26 = "https://cdn.discordapp.com/attachments/772764979803717652/983848048536985640/kirklareli.jpg"
        val map_url26 = "https://www.google.com/maps/place/Onur+Market/@40.9503561,27.1944856,8z/data=!4m19!1m13!4m12!1m4!2m2!1d29.0808898!2d40.1728884!4e1!1m6!1m2!1s0x40a75369416ee08f:0x278fb67805ec7873!2sBademlik,+Onur+Market,+Hastane+Cd.+31%2FA,+39010+Kırklareli+Merkez%2FKırklareli!2m2!1d27.2170517!2d41.7387587!3m4!1s0x40a75369416ee08f:0x278fb67805ec7873!8m2!3d41.7387587!4d27.2170517?hl=tr"
        val website26 = "http://www.onurmarket.com/"
        val review26 = "Affordable prices, the meal card passes Multinet, but discounts cannot be used on multinet"
        val category_id26 = 7
        val place26 = Place(
            0,
            place_name26,
            place_desc26,
            phone26,
            address26,
            star_point26,
            feature26,
            open_time26,
            close_time26,
            day_open26,
            day_close26,
            uimage_url26,
            map_url26,
            website26,
            review26,
            category_id26
        )

        val place_name27 = "Bim Supermarket"
        val place_desc27 = "The main principle of BİM is to deliver basic food and consumables to consumers with high quality and the most affordable price. BİM, the first representative of the hard-discount model in Turkey, has approximately 750 products in its portfolio and aims to offer a large number of private label products to its customers."
        val phone27 = "(0850) 254 44 44"
        val address27= "İstasyon, Edirne Cd. 62 A-B, 39000 Kırklareli Merkez/Kırklareli"
        val star_point27 = "4.0"
        val feature27 = 0
        val open_time27 = "09:00"
        val close_time27 = "21:00"
        val day_open27 = "7day"
        val day_close27 = "No"
        val uimage_url27 = "https://cdn.discordapp.com/attachments/772764979803717652/983849726694813696/bim.jpg"
        val map_url27 = "https://www.google.com/maps/place/BİM/@40.9444317,27.1944855,8z/data=!4m19!1m13!4m12!1m4!2m2!1d29.0808898!2d40.1728884!4e1!1m6!1m2!1s0x40a753df0b1dbaf1:0x65f3b11958501e32!2sİstasyon,+BİM,+Edirne+Cd.+62+A-B,+39000+Kırklareli+Merkez%2FKırklareli!2m2!1d27.2097418!2d41.7226172!3m4!1s0x40a753df0b1dbaf1:0x65f3b11958501e32!8m2!3d41.7226172!4d27.2097418"
        val website27 = "https://www.bim.com.tr/Categories/104/magazalar.aspx?CityKey=39&CountyKey=1471"
        val review27 = "Relevance of staff is good. Bimciler is always relevant though. Nice is appropriate and it is even more beautiful when they promote"
        val category_id27 = 7
        val place27 = Place(
            0,
            place_name27,
            place_desc27,
            phone27,
            address27,
            star_point27,
            feature27,
            open_time27,
            close_time27,
            day_open27,
            day_close27,
            uimage_url27,
            map_url27,
            website27,
            review27,
            category_id27
        )

        mPlaceViewModel.addPlace(place)
        mPlaceViewModel.addPlace(place1)
        mPlaceViewModel.addPlace(place3)
        mPlaceViewModel.addPlace(place4)
        mPlaceViewModel.addPlace(place5)
        mPlaceViewModel.addPlace(place6)
        mPlaceViewModel.addPlace(place7)
        mPlaceViewModel.addPlace(place9)
        mPlaceViewModel.addPlace(place10)
        mPlaceViewModel.addPlace(place11)
        mPlaceViewModel.addPlace(place12)
        mPlaceViewModel.addPlace(place13)
        mPlaceViewModel.addPlace(place14)
        mPlaceViewModel.addPlace(place15)
        mPlaceViewModel.addPlace(place16)
        mPlaceViewModel.addPlace(place17)
        mPlaceViewModel.addPlace(place18)
        mPlaceViewModel.addPlace(place19)
        mPlaceViewModel.addPlace(place20)
        mPlaceViewModel.addPlace(place21)
        mPlaceViewModel.addPlace(place22)
        mPlaceViewModel.addPlace(place23)
        mPlaceViewModel.addPlace(place24)
        mPlaceViewModel.addPlace(place25)
        mPlaceViewModel.addPlace(place26)
        mPlaceViewModel.addPlace(place27)

        Toast.makeText(this, "Save Successful !!!!", Toast.LENGTH_SHORT).show()
    }

}