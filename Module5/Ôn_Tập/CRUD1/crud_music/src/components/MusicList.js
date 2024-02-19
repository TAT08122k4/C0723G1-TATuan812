import React, { useState, useEffect } from 'react';
import { getAll } from '../service/MusicService';
import { Link, useNavigate } from "react-router-dom";



export function MusicList() {
    const [musics,setMusics] = useState([]);
    useEffect (() => {
        const displayMusic = async () => {
           try {
            const result = await getAll();
            setMusics(result);
            console.log(musics);
           } catch (error) {
            console.log(error);
           }
        };
        displayMusic();
     
    },[])

    return (
        <>
        <h1>List Music</h1>
        <table className='table table-hover table-bordered'>
    <thead>
        <th>#</th>
        <th>Tên Bài Hát</th>
        <th>Ca Sĩ</th>
        <th>Tác Giả</th>
        <th>Thời Gian Phát</th>
        <th>Lượt Thích</th>
        <th>Công Khai</th>
        <th>Action</th>
    </thead>
    <tbody>
        {
 musics.map((item,index) => (
    <tr key={item.id}>
        <th>{index}</th>
        <th>{item.baiHat}</th>
        <th>{item.caSi}</th>
        <th>{item.tacGia}</th>
        <th>{item.thoiGianPhat}</th>
        <th>{item.soLuotThich}</th>
        <th>
            {
            (item.trangThai == false) ? <button onClick={
                item.trangThai = true
            }>Công Khai</button> : <p>Đã Công Khai</p>
            }
        </th>
        <th>
            <Link to={"update/" + item.id}><button>Update</button></Link>
        </th>
    </tr>
))
        }
       
    </tbody>
        </table>
        </>
    )

}