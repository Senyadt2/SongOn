import React from 'react'

const LibraryLeft = () => {
  return (
    <>
       {/* left  */}
       <div className="w-[25%] h-[100vh] pb-10  mt-3 overflow-y-auto  px-5 py-10 p-5 text-2xl bg-[#11111182] rounded-xl">
        <h1 className="text-2xl text-[#E5E7EB] ">Librarys</h1>
        <div className="w-full mt-3 h-[2px] bg-black "></div>
        <div className="w-full h-[110vh] pb-[200px]  mt-9  justify-between flex flex-col gap-10">
          {/* top card  */}
          <div className="w-full px-5 py-10 rounded-lg  bg-[#111827] flex flex-col gap-5">
            <div class="min-w-[250px]"><img src="/Artist/future.jpg" alt="" className="w-full h-full rounded-lg"  /></div>
            <div className="text-2xl text-[#FFFFFF]">Song name</div>
            <div className="text-lg text-[#E5E7EB]">Artist</div>
          </div>
          {/* bottom card  */}
         
          <div className="w-full  pb-5  rounded-lg  bg-[#111827] flex flex-col gap-5">
            <div class="w-full"><img src="/Artist/future.jpg" alt="" className="w-full h-full rounded-md" /></div>
            <div className="px-5 flex flex-col gap-2">
              <div className="text-xl text-[#FFFFFF]">Artist name</div>
              <div className="text-lg text-[#E5E7EB]">Artist</div>
              <div className="text-base text-[#E5E7EB]">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quibusdam dolores repellendus rerum.</div>
            </div>
          </div>
         
        </div>
      </div>
    </>
  )
}

export default LibraryLeft
