const express = require("express");
const router = express.Router();
const User = require('../models/users');
const multer = require('multer')
const fs = require('fs')

var storage = multer.diskStorage({
    destination : function(req,file,cb){
        cb(null,'./uploads')
    },
    filename : function (req,file,cb) {
        cb(null,file.fieldname + "_" + Date.now() + "_" + file.originalname);
    },
})
var upload = multer({
    storage : storage,
}).single("image");

router.post("/add", upload, (req, res) => {
    const user = new User({
        name: req.body.name,
        email: req.body.email,
        phone: req.body.phone,
        image: req.file.filename,
    });

    user.save()
        .then(() => {
            req.session.message = {
                type: 'success',
                message: 'User added Successfully'
            };
            res.redirect("/");
        })
        .catch(err => {
            res.json({ message: err.message, type: 'danger' });
        });
});

router.get("/", async (req, res) => {
    try {
        const users = await User.find().exec();
        res.render('index', {
            title: 'Home Page',
            users: users,
        });
    } catch (err) {
        res.json({ message: err.message });
    }
});
router.get("/add",(req,res) => {
    res.render('addUser',{title : "Add Users"})
})
// router.get("/edit/:id",(req,res) => {
//     let id = req.params.id;
//     User.findById(id , (err,user) => {
//         if(err){
//             res.redirect('/');
//         }else{
//             if(user == null){
//                 res.redirect('/')
//             } else{
//                 res.render('edit_users', {
//                     title : "Edit User",
//                     user : user,
//                 })
//             }
//         }
//     })
// })
function findUserByIdCallback(err, user, res) {
    if (err) {
        res.redirect('/');
    } else {
        if (user == null) {
            res.redirect('/');
        } else {
            res.render('edit_users', {
                title: "Edit User",
                user: user,
            });
        }
    }
}
router.get("/edit/:id", async (req, res) => {
    try {
        let id = req.params.id;
        let user = await User.findById(id);
        if (user == null) {
            res.redirect('/');
        } else {
            res.render('editUsers', {
                title: "Edit User",
                user: user,
            });
        }
    } catch (err) {
        res.redirect('/');
    }
});
router.post("/edit/:id",async (req,res) => {
    try {
        
    } catch (error) {
        res.redirect('/')
    }
})

module.exports = router;                                