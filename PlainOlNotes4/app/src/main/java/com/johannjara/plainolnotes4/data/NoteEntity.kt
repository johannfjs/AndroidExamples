package com.johannjara.plainolnotes4.data

import com.johannjara.plainolnotes4.NEW_NOTE_ID
import java.util.*

data class NoteEntity(
    val id: Int,
    var date: Date,
    var text: String
) {
    constructor() : this(id = NEW_NOTE_ID, date = Date(), text = "")
    constructor(date: Date, text: String) : this(id = NEW_NOTE_ID, date = date, text = text)
}
