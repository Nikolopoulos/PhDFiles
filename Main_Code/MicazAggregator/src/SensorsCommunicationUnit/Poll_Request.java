package SensorsCommunicationUnit;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Poll_Request'
 * message type.
 */

public class Poll_Request extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 2;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 66;

    /** Create a new Poll_Request of size 2. */
    public Poll_Request() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Poll_Request of the given data_length. */
    public Poll_Request(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request with the given data_length
     * and base offset.
     */
    public Poll_Request(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request using the given byte array
     * as backing store.
     */
    public Poll_Request(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request using the given byte array
     * as backing store, with the given base offset.
     */
    public Poll_Request(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public Poll_Request(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request embedded in the given message
     * at the given base offset.
     */
    public Poll_Request(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Poll_Request embedded in the given message
     * at the given base offset and length.
     */
    public Poll_Request(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Poll_Request> \n";
      try {
        s += "  [messageType=0x"+Long.toHexString(get_messageType())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: messageType
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'messageType' is signed (false).
     */
    public static boolean isSigned_messageType() {
        return false;
    }

    /**
     * Return whether the field 'messageType' is an array (false).
     */
    public static boolean isArray_messageType() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'messageType'
     */
    public static int offset_messageType() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'messageType'
     */
    public static int offsetBits_messageType() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'messageType'
     */
    public int get_messageType() {
        return (int)getUIntBEElement(offsetBits_messageType(), 16);
    }

    /**
     * Set the value of the field 'messageType'
     */
    public void set_messageType(int value) {
        setUIntBEElement(offsetBits_messageType(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'messageType'
     */
    public static int size_messageType() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'messageType'
     */
    public static int sizeBits_messageType() {
        return 16;
    }

}
