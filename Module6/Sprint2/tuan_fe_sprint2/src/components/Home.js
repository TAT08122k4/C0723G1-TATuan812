import "../styles/Home.css"
import { FooterBook } from "./Footer"
import { HeaderBook } from "./Header"

export function HomePage(){
    return(
        <>
        <HeaderBook></HeaderBook>
        {/*MAIN-CONTENT*/}
        <div
          className="container"
          style={{ backgroundColor: "white", height: "100%" }}
        >
          <div className="row">
            <h3>SÁCH HOT &gt;</h3>
          </div>
          {/*        Carousel*/}
          <section className="movieCarousel">
                <div id="movieCarousel" className="carousel slide" data-ride="carousel">
                    <ol className="carousel-indicators container">
                        <li data-target="#movieCarousel" data-slide-to={0} className="active" />
                        <li data-target="#movieCarousel" data-slide-to={1} />
                        <li data-target="#movieCarousel" data-slide-to={2}  />
                    </ol>
                    <div className="carousel-inner">
                        <div className="carousel-item active hero1">
                            <div className="carousel-item__overlay" />
                            <div className="container carousel-caption d-md-block">
                                <p>Tiểu Thuyết</p>
                                <h2 className="display-4">Nhà Giả Kim</h2>
                                <p>
                                Trong Nhà Giả Kim, nhân vật chính là Santiago, một người chăn cừu. Cuộc hành trình của Santiago đưa anh từ vùng quê Andaluisa ở phía nam Tây Ban Nha đến Kim tự tháp Ai Cập. Trong hành trình này, Santiago gặp nhiều người và trải qua nhiều thử thách, tìm kiếm kho tàng bí mật và khám phá ý nghĩa của cuộc sống.
                                </p>
                                <div className="carousel-item__trailer mt-4">
                                    <span className="d-inline-block mr-2 text-white rounded-circle text-center">CO8</span> 

                                    <button className="btn-playTrailer"><i className="fa fa-play mr-2 playtrailer" /><span style={{fontSize: "1rem"}}> Mượn</span>
                                        <div className="btn__overlay" />
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div className="carousel-item hero2">
                            <div className="carousel-item__overlay" />
                            <div className="container carousel-caption d-md-block">
                                <p>Hành động, thám hiểm, tình cảm</p>
                                <h2 className="display-4">End of the World: Part II</h2>
                                <p>Rõ ràng là một quy trình động, theo sau sự biến đổi của thói quen của người đọc. Điều đáng
                                    ngạc nhiên là chúng ta chú ý rằng chữ Gothic, mà chúng ta hiện nay cho là ít quan trọng
                                </p>
                                <div className="carousel-item__trailer mt-4">
                                    <span className="d-inline-block mr-2 text-white rounded-circle text-center">C08</span>
                                    <button className="btn-playTrailer"><i className="fa fa-play mr-2 playtrailer" /><span style={{fontSize: "1rem"}}>Xem trailer</span>
                                        <div className="btn__overlay" />
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div className="carousel-item hero3">
                            <div className="carousel-item__overlay" />
                            <div className="container carousel-caption d-md-block">
                                <p>Hành động, thám hiểm, tình cảm</p>
                                <h2 className="display-4">End of the World: Part III</h2>
                                <p>Rõ ràng là một quy trình động, theo sau sự biến đổi của thói quen của người đọc. Điều đáng
                                    ngạc nhiên là chúng ta chú ý rằng chữ Gothic, mà chúng ta hiện nay cho là ít quan trọng
                                </p>
                                <div className="carousel-item__trailer mt-4">
                                    <span className="d-inline-block mr-2 text-white rounded-circle text-center">C08</span>
                                    <button className="btn-playTrailer"><i className="fa fa-play mr-2 playtrailer" /><span style={{fontSize: "1rem"}}>Xem trailer</span>
                                        <div className="btn__overlay" />
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
          {/*        Kho sách*/}
          <div className="row mt-5">
            <div className="col-lg-9 left px-0">
              <h3>KHO SÁCH &gt;</h3>
              <section class="articles">
  <article>
    <div class="article-wrapper">
      <figure>
        <img src="https://th.bing.com/th/id/OIP.7QToANsRlnQeK6iEMZBEyQHaD3?w=321&h=180&c=7&r=0&o=5&pid=1.7" alt="" />
      </figure>
      <div class="article-body">
        <h2>Đắc Nhân Tâm</h2>
        <p>
          Curabitur convallis ac quam vitae laoreet. Nulla mauris ante, euismod sed lacus sit amet, congue bibendum eros. Etiam mattis lobortis porta. Vestibulum ultrices iaculis enim imperdiet egestas.
        </p>
        <a href="#" class="read-more">
          Read more <span class="sr-only">about this is some title</span>
          <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
            <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
          </svg>
        </a>
      </div>
    </div>
  </article>
  <article>

    <div class="article-wrapper">
      <figure>
        <img src="https://th.bing.com/th/id/OIP.1bTWUoVL59oQ90zv5UFEKwHaF5?rs=1&pid=ImgDetMain" alt="" />
      </figure>
      <div class="article-body">
        <h2>Nhà Giả Kim</h2>
        <p>
          Curabitur convallis ac quam vitae laoreet. Nulla mauris ante, euismod sed lacus sit amet, congue bibendum eros. Etiam mattis lobortis porta. Vestibulum ultrices iaculis enim imperdiet egestas.
        </p>
        <a href="#" class="read-more">
          Read more <span class="sr-only">about this is some title</span>
          <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
            <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
          </svg>
        </a>
      </div>
    </div>
  </article>
  <article>

    <div class="article-wrapper">
      <figure>
        <img src="https://picsum.photos/id/103/800/450" alt="" />
      </figure>
      <div class="article-body">
        <h2>This is some title</h2>
        <p>
          Curabitur convallis ac quam vitae laoreet. Nulla mauris ante, euismod sed lacus sit amet, congue bibendum eros. Etiam mattis lobortis porta. Vestibulum ultrices iaculis enim imperdiet egestas.
        </p>
        <a href="#" class="read-more">
          Read more <span class="sr-only">about this is some title</span>
          <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
            <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
          </svg>
        </a>
      </div>
    </div>
  </article>
  <article>

<div class="article-wrapper">
  <figure>
    <img src="https://picsum.photos/id/1005/800/450" alt="" />
  </figure>
  <div class="article-body">
    <h2>This is some title</h2>
    <p>
      Curabitur convallis ac quam vitae laoreet. Nulla mauris ante, euismod sed lacus sit amet, congue bibendum eros. Etiam mattis lobortis porta. Vestibulum ultrices iaculis enim imperdiet egestas.
    </p>
    <a href="#" class="read-more">
      Read more <span class="sr-only">about this is some title</span>
      <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
        <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
      </svg>
    </a>
  </div>
</div>
</article>
<article>

<div class="article-wrapper">
  <figure>
    <img src="https://picsum.photos/id/1005/800/450" alt="" />
  </figure>
  <div class="article-body">
    <h2>This is some title</h2>
    <p>
      Curabitur convallis ac quam vitae laoreet. Nulla mauris ante, euismod sed lacus sit amet, congue bibendum eros. Etiam mattis lobortis porta. Vestibulum ultrices iaculis enim imperdiet egestas.
    </p>
    <a href="#" class="read-more">
      Read more <span class="sr-only">about this is some title</span>
      <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
        <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
      </svg>
    </a>
  </div>
</div>
</article>
</section>
            </div>
            <div className="col-lg-3 right">
              <h3>SÁCH ĐỀ CỬ &gt;</h3>
              <div className="pt-4">
                <table className="table table-hover">
                  <tbody>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <a href="##">1. Luyện Khí mười vạn năm</a>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
       <FooterBook></FooterBook>
      </>
      
      
    )
}