package com.oybekdev.notes.repository

import com.oybekdev.notes.database.NoteDatabase
import com.oybekdev.notes.model.Note

class NoteRepository(private val db : NoteDatabase) {
//suspend make sure that all this operation is runnigng on
    //background thread
    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    //don't requite param because it is retrieving
    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)
}