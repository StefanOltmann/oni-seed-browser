/*
 * Hybrid serializer that uses:
 * - ID for Protobuf
 * - Name for JSON
 */

package model.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import model.GeyserType

object GeyserTypeSerializer : KSerializer<GeyserType> {

    private val idSerializer = GeyserTypeIdSerializer
    private val nameSerializer = GeyserTypeStringSerializer

    override val descriptor: SerialDescriptor =
        idSerializer.descriptor

    override fun serialize(encoder: Encoder, value: GeyserType) {
        when (encoder) {
            is JsonEncoder -> nameSerializer.serialize(encoder, value)
            else -> idSerializer.serialize(encoder, value)
        }
    }

    override fun deserialize(decoder: Decoder): GeyserType =
        when (decoder) {
            is JsonDecoder -> nameSerializer.deserialize(decoder)
            else -> idSerializer.deserialize(decoder)
        }
}
