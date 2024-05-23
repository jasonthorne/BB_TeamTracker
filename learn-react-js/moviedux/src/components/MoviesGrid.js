import React, {useState, useEffect} from 'react';
import '../styles.css';
import MovieCard from './MovieCard';

export default function MoviesGrid(){

    /*creating a state:
    'movies' is the variable 
    'setMovies' is method that updates movies (it's state)
    */
    const [movies, setMovies] = useState([]); //initialising movies as empty array.

    /*
    We have to use an effect to set the initial state of the movies:
    i.e only ONCE when the component first renders (like an initialiser - I think!)
    setMovies(['movie 1','movie 2']) WONT work here, as this component keeps rendering, so this will keep being done!
    */

    useEffect(()=>{ //takes anono func as first arg
        //const testMovies = ['a', 'b', 'c']; //dummy movies
        //setMovies(testMovies); //set the state for movies

        //use fetch function to get data from url:
        //path 'moveis.json' works here as this component is injected into index.html and movies.json lives there too
        fetch('movies.json') //.then as this could take a while!
        .then(response => response.json()) //response is what's returned from the fetch, which we then return as json data
        .then(jsonData => setMovies(jsonData)); //then returned json data is passed into setMovies() to set the state for movies

    }, []); //sending empty array as 2nd arg as we dont want to provide any ibfo on when to repeat this effect (as we only want it working once)
    
    return(
        <div className='movies-grid'>
            {
                movies.map(movie => (
                    //add movie card with parameter of movie, and a unique id for targeting
                    <MovieCard movie={movie} key={movie.id}></MovieCard> 

                    //give div a unique key from movie's id property (needed):
                    /*<div key={movie.id} className='movie-card'>
                        <img src={`images/${movie.image}`} alt={movie.title}></img>
                        <div className='movie-card-info'>
                            <h3 className='movie-card-title'>{movie.title}</h3>
                            <p className='movie-card-genre'>{movie.genre}</p>
                            <p className='movie-card-rating'>{movie.rating}</p>
                        </div>
                    </div>*/

                ))
            }
        </div>
    );
};