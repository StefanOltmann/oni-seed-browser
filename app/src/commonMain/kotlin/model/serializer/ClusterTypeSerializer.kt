/*
 * Hybrid serializer that uses:
 * - ID for Protobuf
 * - Name for JSON
 */

package model.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import model.ClusterType

object ClusterTypeSerializer : KSerializer<ClusterType> {

    private val idSerializer = ClusterTypeIdSerializer
    private val prefixSerializer = ClusterTypePrefixSerializer

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ClusterTypeSerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: ClusterType) {
        when (encoder) {
            is JsonEncoder -> prefixSerializer.serialize(encoder, value)
            else -> idSerializer.serialize(encoder, value)
        }
    }

    override fun deserialize(decoder: Decoder): ClusterType =
        when (decoder) {
            is JsonDecoder -> prefixSerializer.deserialize(decoder)
            else -> idSerializer.deserialize(decoder)
        }
}
