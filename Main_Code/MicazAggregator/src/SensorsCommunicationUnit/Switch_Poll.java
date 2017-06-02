package SensorsCommunicationUnit;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Switch_Poll'
 * message type.
 */

public class Switch_Poll extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 4;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 81;

    /** Create a new Switch_Poll of size 4. */
    public Switch_Poll() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Switch_Poll of the given data_length. */
    public Switch_Poll(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll with the given data_length
     * and base offset.
     */
    public Switch_Poll(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll using the given byte array
     * as backing store.
     */
    public Switch_Poll(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll using the given byte array
     * as backing store, with the given base offset.
     */
    public Switch_Poll(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public Switch_Poll(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll embedded in the given message
     * at the given base offset.
     */
    public Switch_Poll(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Switch_Poll embedded in the given message
     * at the given base offset and length.
     */
    public Switch_Poll(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Switch_Poll> \n";
      try {
        s += "  [messageType=0x"+Long.toHexString(get_messageType())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
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

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'id'
     */
    public int get_id() {
        return (int)getUIntBEElement(offsetBits_id(), 16);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(int value) {
        setUIntBEElement(offsetBits_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 16;
    }

}
