package model.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import model.AsteroidType

object AsteroidTypeSerializer : KSerializer<AsteroidType> {

    private val idSerializer = AsteroidTypeIdSerializer
    private val nameSerializer = AsteroidTypeStringSerializer

    override val descriptor: SerialDescriptor =
        idSerializer.descriptor

    override fun serialize(encoder: Encoder, value: AsteroidType) {
        when (encoder) {
            is JsonEncoder -> nameSerializer.serialize(encoder, value)
            else -> idSerializer.serialize(encoder, value)
        }
    }

    override fun deserialize(decoder: Decoder): AsteroidType =
        when (decoder) {
            is JsonDecoder -> nameSerializer.deserialize(decoder)
            else -> idSerializer.deserialize(decoder)
        }
}
