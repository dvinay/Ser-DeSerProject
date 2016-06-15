# Ser-DeSerProject
Serializable and deserializable using Java
------

###### Serialization is a process of converting an object into a sequence of bytes which can be persisted to a disk or database or can be sent through streams.

###### The reverse process of creating object from sequence of bytes is called deserialization.

###### Serializable API encapsulated under java.io package for serializing and deserializing objects which include,
  * java.io.serializable
  * java.io.Externalizable
  * ObjectInputStream
  * ObjectOutputStream

* writeObject():
  * method of ObjectOutputStream class serializes an object and send it to the output stream.
  e.g:
  ```java
    public final void writeObject(object x) throws IOException
  ```
  
* readObject() :
  * method of ObjectInputStream class references object out of stream and deserialize it.
  e.g:
  ```java
    public final Object readObject() throws IOException,ClassNotFoundException
  ```
