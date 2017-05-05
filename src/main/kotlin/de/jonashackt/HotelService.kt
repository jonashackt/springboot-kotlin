package de.jonashackt

import org.springframework.stereotype.Service

@Service
class HotelService(val repository: HotelRepository) {

    fun saveHotel(hotel : Hotel) = repository.save(hotel)

    fun getHotels(): Any = repository.findAll()

}
