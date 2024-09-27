package serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import model.GeyserType

object GeyserTypeSerializer : KSerializer<GeyserType> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("GeyserType", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: GeyserType) =
        encoder.encodeString(value.type)

    override fun deserialize(decoder: Decoder): GeyserType {

        val type = decoder.decodeString()

        return GeyserType.entries.find { it.type == type }
            ?: throw IllegalArgumentException("Unknown type: $type")
    }
}
