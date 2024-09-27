package serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import model.Cluster

object ClusterSerializer : KSerializer<Cluster> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Cluster", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Cluster) =
        encoder.encodeString(value.prefix)

    override fun deserialize(decoder: Decoder): Cluster {

        val prefix = decoder.decodeString()

        return Cluster.entries.find { it.prefix == prefix }
            ?: throw IllegalArgumentException("Unknown prefix: $prefix")
    }
}
