import mongoose from "mongoose"
async function connect () {
    try {
        let connection = await mongoose.connect(process.env.MONGO_URI)
        console.log('connect mongoose successfull');
    } catch (error) {
        // let errorMessage = 
        debugger
        throw new Error('Cannot connect to MongoDB')
    }
}
export default connect 
connect()