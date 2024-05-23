import React from 'react';
import '../styles.css';


//<MovieCard movie={movie}></MovieCard> - creating a movie component add movie property, which is whats passed in below
export default function MovieCard({movie}){ //Note the need for this to be in braces :P
 
    return(
        <div key={movie.id} className='movie-card'>
            <img src={`images/${movie.image}`} alt={movie.title}></img>
            <div className='movie-card-info'>
                <h3 className='movie-card-title'>{movie.title}</h3>
                <p className='movie-card-genre'>{movie.genre}</p>
                <p className='movie-card-rating'>{movie.rating}</p>
            </div>
        </div>
    );
}