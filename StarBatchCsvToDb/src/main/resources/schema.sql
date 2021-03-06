DROP TABLE IF EXISTS star;

CREATE TABLE star  (
    id INT NOT NULL PRIMARY KEY,
    hip INT,
    draper INT,
    hr INT,
    gl VARCHAR(20),
    bf VARCHAR(20),
    proper VARCHAR(20),
    ra DOUBLE,
    decn DOUBLE,
    dist DOUBLE,
    pmra DOUBLE,
    pmdec DOUBLE,
    rv DOUBLE,
    mag DOUBLE,
    absmag DOUBLE,
    spect VARCHAR(20),
    ci DOUBLE,
    x DOUBLE,
    y DOUBLE,
    z DOUBLE,
    vx DOUBLE,
    vy DOUBLE,
    vz DOUBLE,
    rarad DOUBLE,
    decrad DOUBLE,
    pmrarad DOUBLE,
    pmdecrad DOUBLE,
    bayer VARCHAR(10),
    flam INT,
    con VARCHAR(3),
    comp INT,
    comp_primary BIGINT,
    base VARCHAR(10),
    lum DOUBLE,
    var VARCHAR(10),
    var_min DOUBLE,
    var_max DOUBLE
);