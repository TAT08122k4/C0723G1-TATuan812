const mongoose = require('mongoose');
const userSchema = new mongoose.Schema({
    fullName: {
        type : String
    },
    email: {
        type : String
    },
    password: { 
        type : String
    },
    phone : {
        type : String
    
    },
    address: { 
        type : String
    }
});
const Students = mongoose.model('Students',userSchema)
module.exports = Students;