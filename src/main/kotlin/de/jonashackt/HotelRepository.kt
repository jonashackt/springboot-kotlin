package de.jonashackt

import org.springframework.data.mongodb.repository.MongoRepository

interface HotelRepository : MongoRepository<Hotel, String>
