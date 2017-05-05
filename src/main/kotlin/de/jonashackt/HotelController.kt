package de.jonashackt

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hotel")
class HotelController(val hotelService: HotelService) {

    @PostMapping
    fun saveHotel(@RequestBody hotel : Hotel) = hotelService.saveHotel(hotel)

    @GetMapping
    fun getHotel() = hotelService.getHotels()
}
