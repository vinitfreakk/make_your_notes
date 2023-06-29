package com.example.karlebhai.Repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.karlebhai.Dao.NotesDao
import com.example.karlebhai.Models.Notes

class NotesRepository(val dao:NotesDao) {

    fun getAllNotes():LiveData<List<Notes>> = dao.getNotes()

    suspend fun insertNotes(notes:Notes) = dao.insertNotes(notes) //background thread me chal raha hai aur iska insertNotes wala method bhi suspend hai

    suspend fun deleteNotes(id:Int) = dao.deleteNotes(id)

    suspend fun updateNotes(notes: Notes) = dao.updateNotes(notes)




}