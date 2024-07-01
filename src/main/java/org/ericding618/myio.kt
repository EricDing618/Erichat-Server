package org.ericding618

import java.io.File
import com.google.gson.Gson
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.Properties

class FileHandler {
    fun readDatFile(filePath: String): ByteArray {
        val file = File(filePath)
        return file.readBytes()
    }
    fun writeDatFile(filePath: String, data: ByteArray) {
        val file = File(filePath)
        file.writeBytes(data)
    }

    fun readJsonFile(filePath: String): Any? {
        val file = File(filePath)
        val json = file.readText()
        return Gson().fromJson(json, Any::class.java)
    }
    fun writeJsonFile(filePath: String, data: Any) {
        val file = File(filePath)
        val json = Gson().toJson(data)
        file.writeText(json)
    }

    fun readPropertiesFile(filePath: String): Properties {
        val properties = Properties()
        properties.load(FileInputStream(filePath))
        return properties
    }
    fun writePropertiesFile(filePath: String, properties: Properties) {
        properties.store(FileOutputStream(filePath), null)
    }
}