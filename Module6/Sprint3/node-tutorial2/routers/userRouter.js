const express = require('express')
const studentsModel = require('../models/students');
const app = express();

app.post('/student', async (req,res) => {
    const u = new studentsModel(req.body);
    try {
        await u.save(u);
        res.send(u);
    } catch (error) {
        res.status(500).send(error)
    }
})

module.exports = app;