import React from 'react'

const ArtistList = ({name,image}) => {
  return (
    <div className='w-full h-20 bg-[#0F0F0F]   px-5 py-2 flex items-center gap-5'> 
      <div className='w-[40px] h-[40px] flex justify-center' ><img src={image} className='object-cover rounded-full' alt="Image" onError={(e)=>e.target.src="Artist/future.jpg"} /></div>
      <div ><div className='text-base font-bold text-[#E5E7EB]'> {name} </div> <div className='font-semibold text-sm  text-[#9C9EA0]'>Artist</div> </div>
     
    </div>
  )
}

export default ArtistList
